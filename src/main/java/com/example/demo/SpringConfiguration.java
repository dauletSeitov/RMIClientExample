package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class SpringConfiguration {
	@Bean
	public RmiProxyFactoryBean spitterService() {
		System.out.println("i am creating RmiProxyFactoryBean...");
		RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
		rmiProxy.setServiceUrl("rmi://localhost/SpitterService");
		rmiProxy.setServiceInterface(SpitterService.class);
		return rmiProxy;
	}
	
}
