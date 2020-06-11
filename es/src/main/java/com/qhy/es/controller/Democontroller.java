package com.qhy.es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.qhy.es.service.BookService;

@RestController
public class Democontroller {
	
	@Autowired
	BookService bookService;
	
	
	@RequestMapping(value = "save")
	public Object save() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("key", "成功");
//		bookService.save(null);
		return bookService.save(null);
	}
	@RequestMapping(value = "list")
	public Object getList() {
		return bookService.findAll();
		
	}
}
