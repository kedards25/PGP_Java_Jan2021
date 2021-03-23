package com.learning.autowired_demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	public String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
