package com.ecommerce.discount;

import com.ecommerce.DiscountInferface.IDiscount;

public class PercentageDiscount implements IDiscount {
	
	private final int discountPercentage;
	
	public PercentageDiscount(int discountPercentage)
	{
		this.discountPercentage=discountPercentage;
	}
	
	
	@Override
	public double apply(double price) {
		return Math.max(0,price-(price*discountPercentage/100));
	}

}
