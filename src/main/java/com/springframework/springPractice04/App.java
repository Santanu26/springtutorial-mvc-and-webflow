package com.springframework.springPractice04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springframework/springPractice04/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		Address address = (Address) context.getBean("address");
		patient.speak();
		System.out.println(patient);

		((ClassPathXmlApplicationContext) context).close();
	}
}
