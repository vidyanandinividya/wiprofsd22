package w5_d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Product> products=new ArrayList<>();
		Collections.addAll(products,new Product(2,"Computer"),new Product(1,"Mobile"),new Product(3,"Laptop"));
		products.forEach(p->System.out.print(p.productId+"\t"+p.productName+",\t"));
		System.out.println();
		NameComparator name=new NameComparator();
		Collections.sort(products,name);
		products.forEach(p->System.out.print(p.productId+"\t"+p.productName+","));
		System.out.println();
		IdComparator id=new IdComparator();
		Collections.sort(products,id);
		products.forEach(p->System.out.print(p.productId+"\t"+p.productName+","));
		
		

	}

}
