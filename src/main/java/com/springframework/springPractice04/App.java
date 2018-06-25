package com.springframework.springPractice04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		patient.speak();

		((FileSystemXmlApplicationContext) context).close();
	}
}
