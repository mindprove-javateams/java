import java.util.ArrayList;
import java.util.List;

public class Cart {
	private static Cart instance;
	private List<Product> products;
	private double totalPrice;

	private Cart() {
		products = new ArrayList<>();
		totalPrice = 0;
	}

	public static Cart getInstance() {
		if (instance == null) {
			instance = new Cart();
		}
		return instance;
	}
	//separate class
	public void addProduct(Product product) {
		products.add(product);
		totalPrice += product.getPrice();
	}

	public void removeProduct(Product product) {
		if (products.remove(product)) {
			totalPrice -= product.getPrice();
		} else {
			System.out.println("Product not found in the cart.");
		}
	}

	public void displayCart() {
		if (products.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			System.out.println("Cart Details:");
			for (Product product : products) {
				System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice());
			}
			System.out.println("Total Price: $" + totalPrice);
		}
	}
	
	

	public List<Product> getProducts() {
		return products;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
}
