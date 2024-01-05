package com.lh;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author  smart哥
 *
 * 码炫课堂java技术交流q群：963060292
 */

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = context.getBean(User.class);
		User user2 = (User)context.getBean(Class.forName("com.lh.User"));
		System.out.println(user2);
	}
}
