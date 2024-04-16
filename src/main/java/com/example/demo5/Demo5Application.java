package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo5Application.class, args);

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

		IPL ipl= (IPL)context.getBean("bean1");
		System.out.println(ipl);

		//This method is not available in ApplicationContext interface. So v r using AbstractApplicationContext
		context.registerShutdownHook();//This method is needed for destroy.
	}

}
