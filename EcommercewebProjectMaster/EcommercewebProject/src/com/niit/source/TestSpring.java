package com.niit.source;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring
        {
	     public static void main(String[] args) 
	    {
		 ApplicationContext context = new ClassPathXmlApplicationContext("file:WebContent//Applicationcontext.xml");
		 Employee bean = (Employee) context.getBean("emp");
         bean.sayHello();
        }

 }

