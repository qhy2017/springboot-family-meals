package com.qhy.es.config;

import java.time.Duration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.google.gson.GsonBuilder;

@Configuration
public class ConfigBean {
	/**
	 * 谷歌json转换器
	 * 
	 */
	@Bean
	GsonHttpMessageConverter gsonHttpMessageConverter() {
		 GsonBuilder builder = new GsonBuilder();
	        		 builder.setDateFormat("yyyy-MM-dd");
		return new GsonHttpMessageConverter(builder.create());
	}
	  /**
	   * @description HTTP 协议 端口 9200
	   * @return
	   */
	  @Bean
	  RestHighLevelClient client() {
	
	    ClientConfiguration clientConfiguration = ClientConfiguration.builder() 
	      .connectedTo("localhost:9200")
	      .withConnectTimeout(Duration.ofSeconds(5))//超时时间
	      .withSocketTimeout(Duration.ofSeconds(3))//超时时间
	      .build();
	    return RestClients.create(clientConfiguration).rest();                  
	  }
}
