package com.example.gateway.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;



/**
 * 处理全局过滤器
 */
@Configuration
public class GatewayGlobalFilter implements GlobalFilter, Ordered {


    @Override
    public int getOrder() {
        return 10;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(exchange);
    }
}
