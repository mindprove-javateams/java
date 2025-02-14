package com.mind.payment;

public class CreditCard extends PaymentMethod{

	 private String cardNumber;

	    private CreditCard(String cardNumber) {
	        this.cardNumber = cardNumber;
	        this.balance=1000;
	         
	    }

	    public static CreditCard getInstance(String cardNumber) {
	    
	        return new CreditCard(cardNumber);
	    }
	    
	    public void setCardNumber(String cardNumber) {
	        this.cardNumber = cardNumber;
	    }

	    @Override
	    public void pay(double amount) {
	        if (hasSufficientBalance(amount)) {
	            balance -= amount;
	            System.out.println("Paid Rs " + amount + " using Credit Card: " + cardNumber);
	        } else {
	            System.err.println("Insufficient balance in Credit Card. Please update your card.");
	        }
	    }
}
