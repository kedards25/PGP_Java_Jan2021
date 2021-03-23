package com.learning.dependencyinjectionannotation2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
		basePackages = "com.learning.dependencyinjectionannotation2"
		)
public class DiConfig {

}
