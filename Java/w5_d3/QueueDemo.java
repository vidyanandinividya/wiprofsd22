package w5_d3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		
		Queue<String> queue=new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		System.out.println(queue);
		System.out.println("The First element is"+queue.peek());
		queue.remove();
		System.out.println(queue);
	}
	
	
}
