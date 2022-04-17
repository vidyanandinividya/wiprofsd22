package w4_d3;

public class Car {
	int price;
	String model;
	public void start()
	{
		System.out.println("Car Starts");
	}
	public void stop()
	{
		System.out.println("Car Stops");
	}
	public void display(int price,String model)
	{
		System.out.println(price + "\t"+ model);
	}

}
