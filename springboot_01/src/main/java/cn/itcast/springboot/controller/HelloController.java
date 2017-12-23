package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${name}") 
	private String name;
	@Value("${age}")
	private String age;
	

	@GetMapping("/hello")
	public String hello(){
		
		System.out.println("name= "+name);
		System.out.println("age= "+age);
		return "hello word";
	}
}
