//package com.example.gateway.config;
//
//import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * 限流
// */
////@Configuration
//public class HostAddrKeyResolver  implements KeyResolver {
//    @Override
//    public Mono<String> resolve(ServerWebExchange exchange) {
//
//        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
//    }
//
//    @Bean
//    public HostAddrKeyResolver hostAddrKeyResolver() {
//        return new HostAddrKeyResolver();
//    }
//
//}
