package com.springframework.springPractice04;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springframework/springPractice04/beans/beans.xml");
		NoticesDAO noticeDao = (NoticesDAO) context.getBean("noticesDao");
		try {
			Notice notice1 = new Notice("Shantanu", "This is a simple msg from Shantanu", "cushantanu@gmail.com");
			noticeDao.create(notice1);
			List<Notice> notices = noticeDao.getNotices();
			for (Notice notification : notices) {
				System.out.println(notification);
			}
		} catch (CannotGetJdbcConnectionException connectionError) {
			System.out.println(connectionError.getMessage());
		} catch (DataAccessException dataAccessError) {
			System.out.println(dataAccessError.getMessage());
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
