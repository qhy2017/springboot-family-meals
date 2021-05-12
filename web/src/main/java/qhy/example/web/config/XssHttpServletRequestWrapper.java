package qhy.example.web.config;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.*;

/**
 * 防止xss 攻击
 * @auth qhy
 * @email 1242359237@qq.com
 * @date
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

    static {

    }
    private HttpServletRequest request;

    /**
     * 处理get请求参数
     * @return
     */
    @Override
    public String getQueryString() {
        /**
         * get 传参
         */
        System.out.println("getQueryString----------------------------");
        System.out.println(JSON.toJSONString(super.getQueryString()));
        return XssFilterUtil.clean(super.getQueryString());
    }

    public XssHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        this.request = request;
        System.out.println("--------------");
    }

    /**
     * 项目名
     * @return
     */
    @Override
    public String getContextPath() {
        return super.getContextPath();
    }

    /**
     * 请求方法 post get
     * @return
     */
    @Override
    public String getMethod() {
        return
                super.getMethod();
    }

    /**
     * 处理post请求参数
     * @return
     * @throws IOException
     */
    @Override
    public ServletInputStream getInputStream() throws IOException {
        /**
         * application/json
         */
        String contentType1 = super.getContentType();
        if(contentType1.contains(MediaType.APPLICATION_JSON_VALUE)) {
            String s = IOUtils.toString(super.getInputStream(), Charset.forName("utf-8"));
            String clean = XssFilterUtil.clean(s);
            clean = StringEscapeUtils.escapeHtml(s);
            return new BodyInputStream(clean.getBytes(StandardCharsets.UTF_8));
        }
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpServletResponse response = requestAttributes.getResponse();


        System.out.println("--------------" + contentType1);
        System.out.println("--------------" + super.getServletPath());
        System.out.println("--------------" + super.getServletPath());
        /**
         * 返回默认流
         */
        return super.getInputStream();
    }

    /**
     * 请求参数
     * @return
     */
    @Override
    public Map<String, String[]> getParameterMap() {
        System.out.println("getParameterMap---------------------------------");
        System.out.println(JSON.toJSONString(super.getParameterMap()));
        return super.getParameterMap();
    }

    /**
     * 请求参数 key 值
     * @return
     */
    @Override
    public Enumeration<String> getParameterNames() {
        return
                super.getParameterNames();
    }

    /**
     * 请求参数值
     * @param name
     * @return
     */
    @Override
    public String[] getParameterValues(String name) {
        String[] parameterValues = super.getParameterValues(name);
        System.out.println("parameterValues---------------------------------");
        System.out.println(JSON.toJSONString(parameterValues));
        for(int i = 0; i < parameterValues.length;i++) {
            parameterValues[i] = XssFilterUtil.clean(parameterValues[i]);
        }
        return  parameterValues;
    }

    /**
     * 处理流
     */
    private static class BodyInputStream extends ServletInputStream {
        private final InputStream delegate;

        public BodyInputStream(byte[] body) {
            this.delegate = new ByteArrayInputStream(body);
        }

        @SneakyThrows
        public boolean isFinished() {

            return this.delegate.available() == 0;
        }

        public boolean isReady() {
            return true;
        }

        public void setReadListener(ReadListener readListener) {
            throw new UnsupportedOperationException();
        }

        public int read() throws IOException {
            return this.delegate.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return this.delegate.read(b, off, len);
        }

        public int read(byte[] b) throws IOException {
            return this.delegate.read(b);
        }

        public long skip(long n) throws IOException {
            return this.delegate.skip(n);
        }

        public int available() throws IOException {
            return this.delegate.available();
        }

        public void close() throws IOException {
            this.delegate.close();
        }

        public synchronized void mark(int readlimit) {
            this.delegate.mark(readlimit);
        }

        public synchronized void reset() throws IOException {
            this.delegate.reset();
        }

        public boolean markSupported() {
            return this.delegate.markSupported();
        }
    }

}
