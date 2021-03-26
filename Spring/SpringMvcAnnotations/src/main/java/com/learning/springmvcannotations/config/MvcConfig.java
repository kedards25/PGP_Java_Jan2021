package com.learning.springmvcannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.learning.springmvcannotations")
@EnableWebMvc
public class MvcConfig {
	
	@Bean
	public InternalResourceViewResolver getResolver()
	{
//		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
//		resolver.setPrefix("/views/");
//		resolver.setSuffix(".jsp");
//		return resolver;
		
//		InternalResourceViewResolver resolver=
//				new InternalResourceViewResolver("/views/", ".jsp");
//		return resolver;
		
		return new InternalResourceViewResolver("/views/", ".jsp");
	}

}
