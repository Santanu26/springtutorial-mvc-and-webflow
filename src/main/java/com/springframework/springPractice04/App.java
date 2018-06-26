package com.springframework.springPractice04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springframework/springPractice04/beans/beans.xml");
		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("Simple Text for Console Writer");
		logger.writeFile("Simple Text for File Writer");
		((ClassPathXmlApplicationContext) context).close();
	}
}
