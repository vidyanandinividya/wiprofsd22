package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springdemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student st=(Student)context.getBean("student1");
		Student st1=(Student)context.getBean("student2");
		System.out.println(st.getName());
		System.out.println(st1.getName());
		Employee e1=(Employee)context.getBean("emp1");
		System.out.println(e1);
		Author a1=(Author)context.getBean("author1");
		System.out.println(a1);

	}

}
