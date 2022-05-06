package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertEmpProject {
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
					
					Employee e1=new Employee("John","john@gmail.com");
					Employee e2=new Employee("Jack","jack@gmail.com");
					Employee e3=new Employee("Annie","annie@gmail.com");
					
					Project p1=new Project("ABC");
					Project p2=new Project("xyz");
					Project p3=new Project("def");
					
					
					e1.getProjects().add(p1);
					e1.getProjects().add(p2);
					e2.getProjects().add(p2);
					e3.getProjects().add(p3);
					e3.getProjects().add(p1);
					
					session.save(e1);
					session.save(e2);
					session.save(e3);
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
