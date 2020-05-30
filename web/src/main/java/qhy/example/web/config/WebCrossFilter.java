package qhy.example.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 过滤器
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/14 20:13
 */

@Slf4j
public class WebCrossFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     *  过滤request请求 重置 response
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            /**
             * 转换对象
             */
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            /**
             * 处理业务逻辑
             */
            /**
             * 获取表单参数
             */
            Map<String, String[]> parameterMap = request.getParameterMap();
            /**
             * 获取token
             */
            String token = request.getHeader("token");
            /**
             * 获取cookies
             */
            Cookie[] cookies = request.getCookies();
            /**
             * 增强for循环处理cookies
             */
            for (Cookie cookie : cookies) {
                  log.info(cookie.getComment());
                  log.info(cookie.getDomain());
                  log.info(cookie.getName());
                  log.info(cookie.getPath());
                  log.info(cookie.getValue());
                  /**
                   * 存活时间
                   */
                  int maxAge = cookie.getMaxAge();
                  log.info(String.valueOf(maxAge));
            }

            response.addHeader("Access-Control-Allow-Origin","*");//允许所有来源访问
            response.addHeader("Access-Control-Allow-Method","POST,GET");//允许访问的方式
            String host = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
            response.addHeader("host", host);
            response.addHeader("Access-Control-Expose-Headers","Roleplay-Error-Code");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
            response.addHeader("Access-Control-Allow-Credentials", "true");
            response.addHeader("Access-Control-Allow-Headers","Origin, Content-Type, Accept, Authorization, x-requested-with, cache-control, Access-Control-Allow-Origin, Access-Control-Allow-Credentials, uuid");

            /**
             * 请求头尾option 直接返回true
             */
            if (request.getMethod().equals("OPTIONS")) {
                response.setStatus(HttpServletResponse.SC_OK);
            }else {
                filterChain.doFilter(request,response);
            }
        } catch (Exception e) {
            log.error("过滤器处理业务异常");
        }
        log.info("过滤器结束");
    }

    @Override
    public void destroy() {

    }
}
