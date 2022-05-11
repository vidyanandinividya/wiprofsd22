package w5_d3;

import java.util.Comparator;

public class Product {
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	

}
//Id Comparator
class IdComparator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.productId<p2.productId)
			return -1;
		if(p1.productId>p2.productId)
			return 1;
		else
			return 0;
	}
	
}
//Name Comparator
class NameComparator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.productName.compareTo(p2.productName);
	}
	
}
