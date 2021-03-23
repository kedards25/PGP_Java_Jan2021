package com.learning.dependencyinjectionannotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.dependencyinjectionannotation2.config.DiConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(DiConfig.class);
        
        Demo d=context.getBean(Demo.class);
        
        d.show();
    }
}
