package w4_d5.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundwildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer List
		List<Integer> intList=Arrays.asList(10,20,30,40);
		lowerboundlist(intList);
		//Number List
		List<Number> numList=Arrays.asList(12,34,23,45);
		lowerboundlist(numList);
		

	}
public static void lowerboundlist(List<? super Integer> list)
{
	System.out.println(list);
	}
}
