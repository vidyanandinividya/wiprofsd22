package wiprofsd;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	public void checkout()
	{
		System.out.println("Checked out method from shopping cart");
	}

}
