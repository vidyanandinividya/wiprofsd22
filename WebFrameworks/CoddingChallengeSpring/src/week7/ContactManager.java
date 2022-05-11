package week7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactManager {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
		User user=(User)app.getBean("u");
		System.out.println(user);
		user.contactDetails();
		User user1=(User)app.getBean("u1");
		System.out.println(user1);
		user1.contactDetails();

	}

}
