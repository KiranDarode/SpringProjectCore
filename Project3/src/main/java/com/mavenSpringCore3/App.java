package com.mavenSpringCore3;

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
       ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
       
       College clg=(College) context.getBean("refCollege");
//       System.out.println(clg);
//       
//       
Student std=(Student) context.getBean("refStudent");
        System.out.println(std);
        
        Animal an= (Animal) context.getBean("animal");
        System.out.println(an);
    }
}
