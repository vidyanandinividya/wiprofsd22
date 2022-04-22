package w5_d3;

public class GenericsDemo {

	public static void main(String[] args) {
		var list=new GenericList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//[a,b,c]
		/*var iterator=list.iterator();
		while(iterator.hasNext())
		{
			var current=iterator.next();
			System.out.println(current);
		}*/
		for(var item:list)
		{
			System.out.println(item);
		}

	}

}
