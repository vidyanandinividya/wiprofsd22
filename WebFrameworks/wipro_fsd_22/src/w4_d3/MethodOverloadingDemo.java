package w4_d3;

public class MethodOverloadingDemo {
	
	public double getArea(int radius)
	{
		return 3.14*radius*radius; //used to calculate the area of the circle
	}
	
	public int getArea(int length,int breadth)
	{
		return length*breadth; //used to calculate the area of the rectangle
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo mod=new MethodOverloadingDemo();
		System.out.println(mod.getArea(1));
		System.out.println(mod.getArea(2, 4));

	}

}
