package com.learning.dependencyinjection_config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //providing refernce of xml file where we
    	//have configured how the object has to be created
       Resource res=new ClassPathResource("beans.xml");
       BeanFactory factory=new XmlBeanFactory(res);
       
       //we are referring to object definition in xml file
       //thereby implementing dependency injection
       DependencyInjectionConfig di=
    		   (DependencyInjectionConfig)factory.getBean("demo");
       
       di.show();
       
    }
}
