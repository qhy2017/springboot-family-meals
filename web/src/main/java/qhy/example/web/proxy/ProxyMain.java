package qhy.example.web.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {

    public static void main(String[] args) {

        ProxyDog proxyDog = new ProxyDog();
        Dog proxy = (Dog)proxyDog.getProxy(Dog.class);
        String ho = proxy.eat("爱玩");
        System.out.println(ho);

//        List<String> list = new ArrayList<>();
//        list.add("123");
//        list.add("321");
    }
}
