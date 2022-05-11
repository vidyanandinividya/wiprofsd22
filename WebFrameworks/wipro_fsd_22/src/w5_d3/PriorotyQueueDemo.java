package w5_d3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorotyQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(4);
		pq.add(2);
		pq.add(3);
		System.out.println("Priority Queue:"+pq);
		pq.offer(5);
		System.out.println("Priority Queue:"+pq);

	}

}
