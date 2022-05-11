package w4_d3;

class Calc
{
	int a=2,b=3;
	
	
	/*{
		System.out.println(a+b);
		System.out.println(a-b);
	}
	static
	{
		System.out.println("Static Block");
	}*/
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	Calc()
	{
		System.out.println("Default Constructor");
	}
	Calc(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calc ca=new Calc();
		Calc ca1=new Calc(12,5);
		System.out.println(ca1.getA());
		System.out.println(ca1.getB());*/
		/*Car c=new Car();
		c.start();
		c.stop();*/
System.out.println(10);
System.out.println("Hello");


	}

}
