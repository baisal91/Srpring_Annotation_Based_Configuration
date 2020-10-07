package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.service.CalculatorService;

public class Client {
	
	public static void main(String[] args) {
		
		
		//ApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
		//ConfigurableApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx =new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		CalculatorService cs = (CalculatorService) ctx.getBean("service");
		
		CalculatorService cs2 = (CalculatorService) ctx.getBean("service");
		
		
		System.out.println(cs.service(123456));
		
		System.out.println(cs.hashCode());
		System.out.println(cs2.hashCode());
		
		ctx.close();
		
		
	}

}
