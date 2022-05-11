package wiprofsd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
		TraineeDao tdao=(TraineeDao)app.getBean("dao");
		Trainee t=new Trainee("john","john@gmail.com");
		Trainee t1=new Trainee("Annie","annie@gmail.com");
		Trainee t2=new Trainee("Henry","henry@gmail.com");
		Trainee t3=new Trainee("Lily","lily@gmail.com");
		System.out.println(tdao.addTrainee(t));
		System.out.println(tdao.addTrainee(t1));
		System.out.println(tdao.addTrainee(t2));
		System.out.println(tdao.addTrainee(t3));
		System.out.println("All the trainees are");
		System.out.println(tdao.getAllTrainees());

	}

}
