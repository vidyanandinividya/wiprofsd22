package w5_d3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> maps=new HashMap<>();
		maps.put("Java",new Integer(2));
		maps.put("html",3);
		maps.put("css",4);
		maps.put("Java",new Integer(2));
		System.out.println(maps);
		Set set=maps.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry=(Map.Entry)iterator.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		

	}

}
