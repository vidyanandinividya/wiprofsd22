package w4_d5.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List list=new List();
		list.add(1);  //value type
		list.add("Vidya"); //reference type
		list.add(new User()); //reference type
		
		int number=(int)list.get(0);*/
		var list=new GenericList<Integer>();
		list.add(1);
		var list1=new GenericList<Float>();
		list1.add(10.23f);
		//var list2=new GenericList<User>();

	}

}
