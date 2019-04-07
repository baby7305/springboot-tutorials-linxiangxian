package com.example.demo.controller;

import com.example.demo.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String Hello() {
		return "hello baby";
	}

	@RequestMapping("/getDemo")
	public Demo getDemo() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		return demo;
	}
}
