import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.Level;

public class Product {
	private String productId;
	private String name;
	private double price;
//	private double discount;

	public Product(String productId, String name, double price/* double discount*/) {
		this.productId = productId;
		this.name = name;
		this.price = price;
//		this.discount = discount;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

//	public double getDiscount() {
//		return discount;
//	}
}

class ProductPrinter {
	private static final Logger logger = Logger.getLogger(ProductPrinter.class.getName());

	public void printProductDetails(Product product) {
		logger.info("Printing product details...");

		logger.log(Level.INFO, "Product ID: {0}", product.getProductId());
		logger.log(Level.INFO, "Name: {0}", product.getName());
		logger.log(Level.INFO, "Price: ${0}", product.getPrice());

//		logger.log(Level.INFO, "Name {0}", product.getDiscount());
		System.out.println("Product ID: " + product.getProductId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: $" + product.getPrice());
	}
	
}

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Product ID: ");
		String productId = scanner.nextLine();

		System.out.print("Enter Product Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Product Price: ");
		double price = scanner.nextDouble();

//		System.out.print("Enter Product Discount (%): ");
//		double discount = scanner.nextDouble();

		Product product = new Product(productId, name, price/*discount*/);
		ProductPrinter printer = new ProductPrinter();
		printer.printProductDetails(product);
	}
}
