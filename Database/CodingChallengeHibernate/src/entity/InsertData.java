package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try
		{
			//Student s1=new Student("john","john@gmail.com");
			//Address a1=new Address("bengalore","karnataka",123456,s1);
			Address a2=new Address("xyz","karnataka",123456);
			Student s2=new Student("Annie","annie@gmail.com");
			
			a2.setStudent(s2);
			Address a3=new Address("abc","AP",123456);
			Student s3=new Student("Hary","hary@gmail.com");
			
			a3.setStudent(s3);
			//start transaction
			session.beginTransaction();
			//save details 
			//session.save(a1);
			session.save(a2);
			session.save(a3);
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
