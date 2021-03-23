package com.learning.dependencyinjectionannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.dependencyinjectionannotation.Demo;

@Configuration
@ComponentScan(basePackages = "com.learning.dependencyinjectionannotation")
public class DiAnnotationsConfig {
	
	@Bean
	public Demo getObj()
	{
		Demo d=new Demo();
		return d;
	}
}
