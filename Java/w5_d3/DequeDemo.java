package w5_d3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> numbers=new ArrayDeque<>();
		//Add the elements
		numbers.offer(1);
		numbers.offer(3);
		numbers.offer(2);
		System.out.println("Deque:"+numbers);
		//Access the elements
		
		int fstelement=numbers.peekFirst();
		System.out.println("First element Deque:"+fstelement);
		int lstelement=numbers.peekLast();
		System.out.println("Last element Deque:"+lstelement);
		int removefstelement=numbers.pollFirst();
		System.out.println("First element Deque:"+removefstelement);
		int removelstelement=numbers.pollLast();
		System.out.println("Last element Deque:"+removelstelement);
		System.out.println("Deque:"+numbers);
		

	}

}
