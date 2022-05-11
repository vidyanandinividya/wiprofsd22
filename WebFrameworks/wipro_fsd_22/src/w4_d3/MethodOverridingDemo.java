package w4_d3;

class Parent
{
 public void doSomething()
 {
	 System.out.println("Doing something in Parent class");
 }
}
class Child extends Parent
{
	@Override
	public void doSomething()
	{
		System.out.println("Doing something in Child class");
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();
		p.doSomething(); //call the parent class method
		Parent p1=new Child(); //Dynamic Polymorphism
		//p1 is called polymorphic variable
		//the polymorphic variable can call all the methods of the parent class except overriden method
		//it can call only the overriden method of the child class
		
		p1.doSomething(); //call the overriden method of the child class
		
		

	}

}
