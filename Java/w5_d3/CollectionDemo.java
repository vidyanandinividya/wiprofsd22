package w5_d3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		 Collection<String> collection=new ArrayList<>();
		 collection.add("a");
		 collection.add("b");
		 collection.add("c");
		 Collections.addAll(collection, "d","e","f");
		 collection.remove("b");
		 //collection.clear();
		 System.out.println(collection.size());
		 var x=collection.contains("d");
		 System.out.println(x);
		 String []y=collection.toArray(new String[1000]);
		
		 for(var item:collection)
		 {
			 System.out.print(item);
		 }
		 System.out.println(collection.isEmpty());

	}

}
