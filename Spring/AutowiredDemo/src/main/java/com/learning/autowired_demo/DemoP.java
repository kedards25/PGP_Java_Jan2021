package com.learning.autowired_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoP {
	
	@Autowired
	Demo d;
	
	void setClr()
	{
		d.setColor("Green");
	}
	
	void showColor()
	{
		setClr();
		System.out.println("Color: "+d.getColor());
	}

}
