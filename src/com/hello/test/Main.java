package com.hello.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static AbstractApplicationContext appContext;

	public static void main(String[] args){
		appContext = new ClassPathXmlApplicationContext("HelloWorld.xml");
		HelloWorld helloworld = (HelloWorld) appContext.getBean("helloWorld");
		helloworld.getMessage();
		helloworld.setMessage("Je suis objet a ");
		helloworld.getMessage();
		
		HelloWorld helloworld22 = (HelloWorld) appContext.getBean("helloWorld");
		helloworld22.setMessage("Je suis objet b ");
		helloworld22.getMessage();
		helloworld.getMessage();
		
		Balo balo = (Balo) appContext.getBean("balibo");
		balo.setBalo("aaaaaaaaaa");
		
		helloworld22.setBalo(balo);
		helloworld22.getBalo().getBalo();
		
		System.out.println(helloworld.getBalo());
		
	appContext.registerShutdownHook();
		
	}

}
