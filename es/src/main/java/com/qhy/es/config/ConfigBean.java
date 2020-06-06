package com.qhy.es.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
	
}
