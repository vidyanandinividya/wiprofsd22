package w4_d5.generics;
import java.util.List;
import java.util.Arrays;

public class UpperBoundWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(10,20,30,40);
		
		System.out.println("Total Sum is:"+sum(intList));
		
		List<Double> doubleList=Arrays.asList(12.3,4.5,6.79);
		
		System.out.println("Total Sum is:"+sum(doubleList));
		

	}
	private static double sum(List<? extends Number> myList)
	{
		double sum=0.0;
		for(Number iterator:myList)
		{
			sum+=iterator.doubleValue();
		}
		return sum;
	}

}
