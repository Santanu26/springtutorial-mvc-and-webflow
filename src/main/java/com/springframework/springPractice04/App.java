package com.springframework.springPractice04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springframework/springPractice04/beans/beans.xml");
		Parrot parrot = (Parrot) context.getBean("parrot");
		System.out.println(parrot);
		((ClassPathXmlApplicationContext) context).close();
	}
}
