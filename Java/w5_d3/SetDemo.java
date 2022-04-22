package w5_d3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> data=new HashSet<>();
		
		data.add("hello");
		
		// map.put("hello",dummy)
		data.add("2");
		data.add("java");
		data.add("java");
		System.out.println(data);
		
		Set <Integer> set=new TreeSet<>();
		set.add(10);
		set.add(4);
		set.add(6);
		set.add(3);
		set.add(10);
		System.out.println(set);

	}

}
