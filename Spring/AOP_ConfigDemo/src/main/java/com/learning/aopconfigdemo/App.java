package com.learning.aopconfigdemo;

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
        		new ClassPathXmlApplicationContext("beans.xml");
        
        PrimaryClass primary=(PrimaryClass)context.getBean("primaryBean");
        
        primary.disp();
        
        System.out.println();
        
        primary.show();
    }
}
