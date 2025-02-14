package com.ecommerce.main;

import com.ecommerce.DiscountInferface.IDiscount;
import com.ecommerce.discount.FlatDiscount;
import com.ecommerce.discount.PercentageDiscount;

public class Main {
 public static void main(String[] args) {
	 
	 double discount;
	 
	 Product product1=new Product(); 
	 product1.setId(1);
	 product1.setName("Motrola edge 50 pro");
	 product1.setPrice(29000.0);
	 
	 
	 
	 ProductPrinter productPrinter=new ProductPrinter();
	 productPrinter.printProduct(product1);
	 
	 
	 IDiscount idiscount=new PercentageDiscount(50);
	 IDiscount idiscount1=new FlatDiscount(100.0);
	 
	 product1.getDiscount(idiscount1);
	 
	 System.out.println("========================");
	 
   
    productPrinter.printProduct(product1);
    
	 

	
}
}
