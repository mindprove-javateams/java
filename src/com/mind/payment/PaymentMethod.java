package com.mind.payment;

abstract class PaymentMethod {
    
	 protected double balance;
	
	   public void setBalance(double balance) {
	        this.balance = balance;
	    }
	 
	public abstract void pay(double amount);
	
	 public boolean hasSufficientBalance(double amount) {
	        return balance >= amount;
	    }
}
