package com.learning.propertyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=
    		   new ClassPathXmlApplicationContext("bean.xml");
       
       Demo d=(Demo)context.getBean("demo");
       
       //Demo d2=(Demo)context.getBean("demo2");
       
       System.out.println(d.getVal());
    }
}
