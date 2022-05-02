package lab;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class LabMain {

	public static void main(String[] args) {
		try {
			Configuration configuration=new Configuration().configure();
			configuration.addAnnotatedClass(lab.Teacher.class);
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties());
			SessionFactory factory=configuration.buildSessionFactory(builder.build());
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Teacher t1=new Teacher("John","Smith","john@gmail.com");
			Teacher t2=new Teacher("Annie","Yalker","annie@gmail.com");
			Teacher t3=new Teacher("Henry","Johans","henry@gmail.com");
			Teacher t4=new Teacher("Gustavo","hansberg","gustavo@gmail.com");
			session.save(t1);
			session.save(t2);
			session.save(t3);
			session.save(t4);
			Query query=session.createQuery("from Teacher");
			List<Teacher> teacherList=query.list();
			System.out.println("Teacher Details:");
			for(Teacher t:teacherList)
			{
				System.out.println(t);
			}
			
			transaction.commit();
			session.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}
