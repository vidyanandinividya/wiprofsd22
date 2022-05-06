package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourse {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class)
				.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try
		{
			//start transaction
			session.beginTransaction();
			Course course=session.get(Course.class, 2);
			if(course!=null)
			{
				System.out.println("Deleting"+course);
				session.delete(course);
			}
			
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
