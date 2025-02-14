package com.ecommerce.main;

import com.ecommerce.DiscountInferface.IDiscount;

public class Product {
	private int id;
	private String name;
	private double price;
	private double dicountPrice;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDicountPrice() {
		return dicountPrice;
	}
	public void setDicountAfterPrice(double dicountPrice) {
		this.dicountPrice = dicountPrice;
	}
		  
	public double getDiscount(IDiscount iDiscount)
	{
		dicountPrice=iDiscount.apply(price);
		 return dicountPrice;
	}

}
