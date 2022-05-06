package entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCourse {

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
					//begin transaction
					
					session.beginTransaction();
					Student st=session.get(Student.class, 2);
					 //create some courses
					
					Course c1=new Course("Java");
					Course c2=new Course("HTML");
					Course c3=new Course("JavaScript");
					
					session.save(c1);
					session.save(c2);
					session.save(c3);
					
					c1.setStudent(st);
					c2.setStudent(st);
					c3.setStudent(st);
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
