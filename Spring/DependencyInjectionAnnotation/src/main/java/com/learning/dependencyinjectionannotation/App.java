package com.learning.dependencyinjectionannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.dependencyinjectionannotation.config.DiAnnotationsConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(DiAnnotationsConfig.class);
        
        Demo demo=context.getBean(Demo.class);
        demo.show();
        		
    }
}
