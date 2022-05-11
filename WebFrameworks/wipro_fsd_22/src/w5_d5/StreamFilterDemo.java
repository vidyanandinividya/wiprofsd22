package w5_d5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

public class StreamFilterDemo {

	public static void main(String[] args) {
		
	List<Product> list=new ArrayList<Product>();
		for(Product product:getProducts())
		{
			if(product.getPrice()>25000.00)
			{
				list.add(product);
			}
		}
		for(Product product:list)
		{
			System.out.println(product);
		}
		
		//using Stream API -->Filter
		System.out.println("************************");
		List<Product> list2=getProducts()
				.stream().filter((product)->product.getPrice()>25000.00)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("************************");
		getProducts()
		.stream().filter((product)->product.getPrice()>28000.00).forEach(System.out::println);
	}
	private static List<Product> getProducts()
	{
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"HP Laptop",25000.00));
		productList.add(new Product(2,"Dell Laptop",28000.00));
		productList.add(new Product(3,"Acer Laptop",12000.00));
		productList.add(new Product(4,"Sony Laptop",45000.00));
		productList.add(new Product(5,"Apple Laptop",125000.00));
		return productList;
	}

}
