package com.firstspring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        // Loads the context from XML files located in the classpath "spring.xml".
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Retrieves the bean named "Serius" from the Spring application context.
        // The getBean method returns an object of type Object, so you need to cast it to object type "Serius".
        Serius s = (Serius) context.getBean("Serius");
//        s.age = 10;
//        s.code();
        System.out.println(s.age);

    }
}
