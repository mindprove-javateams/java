package com.ecommerce.main;

public class ProductPrinter {
	
	public void printProduct(Product product)
	{
		System.out.println("Name = " +product.getName());
		System.out.println("Price = " +product.getPrice());
		System.out.println("Discount = " +product.getDicountPrice());
	}
	
	public void printProduct(Product product,double discountAmount)
	{
		System.out.println("Name = " +product.getName());
		System.out.println("Price = " +product.getPrice());
		product.setDicountAfterPrice(discountAmount);
		System.out.println("DiscountAfter = " +product.getDicountPrice());
	}  
}
