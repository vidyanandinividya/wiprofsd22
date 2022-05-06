package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBidirectionalDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class).buildSessionFactory();
		
		//Create session
		Session session=factory.getCurrentSession();
		try
		{
			//create the object and associate it
			
			/*Category c1=new Category("Mobiles");
			Product product=new Product("iphone",c1,24);
			
			Category c2=new Category("Electronics");
			Product product1=new Product("AC",c2,25);
			Product product2=new Product("Inverter",c2,25);*/
			
			//start transaction
			session.beginTransaction();
			
			//Get the category details
			Category c=session.get(Category.class,2);
			System.out.println("category Details"+c);
			//Print the associated product details
			System.out.println("Product Details:"+c.getProduct());
			
			//save the details
			
			/*session.save(product);
			session.save(product1);
			session.save(product2);*/
			
			//commit transaction
			
			session.getTransaction().commit();
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			factory.close();
		}
	}

}
