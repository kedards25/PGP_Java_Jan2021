package com.learning.dependencyinjection_appcontext;

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
        
        Demo d=(Demo)context.getBean("demo");
        d.show();
    }
}
