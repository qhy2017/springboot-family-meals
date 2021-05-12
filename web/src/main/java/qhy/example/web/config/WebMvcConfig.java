package qhy.example.web.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/14 20:08
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * fastjson 转换器支持类型
     */
   private static final List<MediaType> supportedMediaTypes = new ArrayList<MediaType>(){{
                                   add(MediaType.APPLICATION_JSON);
                                   add(MediaType.TEXT_HTML);
        /**
         * 可以在这里添加
         */
    }};


//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//
//
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebCrossFilter());
//        filterRegistrationBean.setName("webFilter");
//        /**
//         * 过滤路径
//         */
//        List<String> list = new ArrayList<>();
//        list.add("/api/*");
//        list.add("/getXList");
//        filterRegistrationBean.setUrlPatterns(list);
////        filterRegistrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        filterRegistrationBean.setInitParameters(new HashMap<>());
////        filterRegistrationBean.setOrder(8);
////        filterRegistrationBean.setFilter(new WebCrossFilter());
////        filterRegistrationBean.setDispatcherTypes();
////        filterRegistrationBean.setMatchAfter();
////        filterRegistrationBean.setServletRegistrationBeans();
////        filterRegistrationBean.setAsyncSupported();
////        filterRegistrationBean.setEnabled();
//        return filterRegistrationBean;
//    }

    @Bean
    public RestTemplate restTemplate() {

        return  new RestTemplate();
    }

    /**
     * 跨域过滤器
     * @return
     */
//    @Bean
//    public WebCrossFilter webFilter(){
//        return new WebCrossFilter();
//    }
    /**
     * 路径配置
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()).excludePathPatterns("/api/*");

    }

    /**
     * 资源配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:static/");
    }

    /**
     *  跨域设置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {

//        registry.addMapping("");

    }

    /**
     * 视图配置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> registry) {

    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
        converters.add(fastJsonHttpMessageConverter);
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

    }

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
