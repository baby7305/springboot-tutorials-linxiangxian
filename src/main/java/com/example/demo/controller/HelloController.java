package com.example.demo.controller;

import com.example.demo.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
		demo.setCreatetime(new Date());
		demo.setRemarks("这是备注信息");
		return demo;
	}
}
