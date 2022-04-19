package w4_d5.generics;

class Sample<T,U>
{
	T obj1; //for key
	U obj2; //value
	
	Sample(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void getObject()
	{
		System.out.println("value of T:"+obj1);
		System.out.println("value of U:"+obj2);
	}
}
public class TwoParamGeneric {
	public static void main(String[] args)
	{
		Sample<String,Integer> sample=new Sample<>("hello",1);
		sample.getObject();
	}

}
