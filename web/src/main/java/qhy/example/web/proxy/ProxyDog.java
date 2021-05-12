package qhy.example.web.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyDog  implements MethodInterceptor {

    public  Object getProxy(Class cls){
        //CGLIB enhancer增强类对象
        Enhancer enhancer=new Enhancer();
        //设置代理类
        enhancer.setSuperclass(cls);
        //定义代理逻辑对象为当前对象   ，对象要继承MethodInterceptor。并实现逻辑方法intercept
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用代理对象前");
        Object result=methodProxy.invokeSuper(o,objects);//真的是代理对象，不像JDk代理，还是真实对象
        System.out.println("调用代理对象后");
        return  result;
    }
}
