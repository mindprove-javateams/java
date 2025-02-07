package com.ecommerce.discount;

import com.ecommerce.DiscountInferface.IDiscount;

public class FlatDiscount implements IDiscount {
	private final double discountAmount;
	
	
	public FlatDiscount(double discountAmount)
	{
		this.discountAmount=discountAmount;
	}
	@Override
	public double apply(double price) {
		return Math.max(0,price-discountAmount);
	}

}
