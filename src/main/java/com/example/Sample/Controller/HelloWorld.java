package com.example.Sample.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String Hello()
	{
		return "Hello_World";
	}

}
