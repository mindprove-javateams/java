package com.mind.payment;

public class PaymentMethodFactory {

	 public static PaymentMethod createPaymentMethod(String methodType, String identifier) {
		 
	        if (methodType.equalsIgnoreCase("CreditCard")) {
	            return CreditCard.getInstance(identifier);  
	        }
	        
	        else if (methodType.equalsIgnoreCase("PayPal")) {
	            return PayPal.getInstance(identifier);
	        }
	        throw new IllegalArgumentException("Unknown payment method type: " + methodType);
	    }
	
}
