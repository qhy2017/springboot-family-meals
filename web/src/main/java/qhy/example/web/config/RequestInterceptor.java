package qhy.example.web.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.charset.StandardCharsets;

/**
 * 连接器
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/14 20:11
 */
//@Configuration
public class RequestInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        boolean b = super.preHandle(request, response, handler);

        /**
         * 适合单体项目 存放session 信息
         */
        HttpSession session = request.getSession();
        session.setAttribute("username","渠红元");


        String token = request.getHeader("token");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("message","token 不正确");
        ServletOutputStream outputStream = response.getOutputStream();
        ServletOutputStream outputStream1 = response.getOutputStream();
        if(token == null) {
            System.out.println("---- preHandle false");
            response.getOutputStream().write(jsonObject.toJSONString().getBytes(StandardCharsets.UTF_8));
            response.getOutputStream().write(jsonObject.toJSONString().getBytes(StandardCharsets.UTF_8));
            return  false;
        }
        System.out.println("---- preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("---- postHandle");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("---- afterCompletion");

        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("---- afterConcurrentHandlingStarted");
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
