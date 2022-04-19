package w4_d5.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(10,20,30,40);
		printList(intList);
		List<Double> doubleList=Arrays.asList(12.3,4.5,6.79);
		printList(doubleList);
		List<Number> numList=Arrays.asList(12,34,23,45);
		printList(numList);

	}
	private static void printList(List<?> list)
	{
		System.out.println(list);
	}

}
