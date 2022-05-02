package pojo;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateMain {

	public static void main(String[] args) {
		System.out.println("Connected Succeessfully");
		try {
		Configuration configuration=new Configuration().configure();
		configuration.addAnnotatedClass(pojo.Product.class);
		configuration.addAnnotatedClass(pojo.Category.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().
				applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//Product p1=new Product(1,"Smart Phone","Mobiles",10);
		//session.save(p1);
		//Product p1=new Product("Mac Book","Laptop",20);
		//Product p2=new Product("Acer","Laptop",25);
		//session.save(p1);
		//session.save(p2);
		//Query query=session.createQuery("from Product where name=:pname");
		//query.setString("pname","Acer");
		//List<Product> productList=query.list();
		/*System.out.println("Product Details:");
		for(Product p:productList)
		{
			System.out.println(p);
		}*/
		
		Category c1=new Category("Mobiles");
		Product p1=new Product("iphone",c1,24);
		session.save(c1);
		session.save(p1);
		transaction.commit();
		session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
