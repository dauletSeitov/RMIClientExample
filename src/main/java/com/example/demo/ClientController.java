package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	public SpitterService spitterService;
	
	@RequestMapping("/get")
	public String doGet() {
		System.out.println("---------------------------------------------------");
		return "got{" + spitterService.getName()+"}";
	}
	
	//@ResponseBody
	@RequestMapping("/set/{str}")
	public String doSet(@PathVariable String str) {
		System.out.println("---------------------------------------------------");
		spitterService.setName(str);
		return "i added...{"+str+"}";
	}

	
}
