package w5_d3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("john");
		list.add("Alie");
		list.add("Hary");
		list.add("Jack");
		System.out.println(list);
		list.add(2,"James");
		System.out.println(list);
		list.addFirst("Jeny");
		list.addLast("Henry");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		ListIterator<String> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		List<String> course=new LinkedList<>();
		course.add("HTML");
		course.add("Java");
		course.add("CSS");
		course.add("Angular");
		int size=course.size();
		System.out.println("Size is:"+size);
		String[] courseList=new String[size];
	
		courseList=course.toArray(courseList);
		

	}

}
