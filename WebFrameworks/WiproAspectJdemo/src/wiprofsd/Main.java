package wiprofsd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
		Validation va=app.getBean("proxy",Validation.class);
		va.validate();
		try {
			va.validate(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
