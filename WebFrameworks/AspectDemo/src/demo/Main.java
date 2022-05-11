package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String []args)
	{
		//first way
		/*AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
		app.register(BeanConfig.class);
		app.refresh();
		ShoppingCart cart=app.getBean(ShoppingCart.class);
		cart.checkout();*/
		
		//second way
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		ShoppingCart cart=context.getBean(ShoppingCart.class);
		cart.checkout("cancelled");
		
		//xml based configuration
		/*ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ShoppingCart cart=(ShoppingCart)context.getBean("cart");
		cart.checkout();*/
	}

}
