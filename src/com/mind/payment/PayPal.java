package com.mind.payment;

class PayPal extends PaymentMethod {
	 private String email;

	    private PayPal(String email) {
	        this.email = email;
	        this.balance = 66087;  
	    }

	    public static PayPal getInstance(String email) {
	        return new PayPal(email);
	    }

	   
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public void pay(double amount) {
	        if (hasSufficientBalance(amount)) {
	            balance -= amount;
	            System.out.println("Paid Rs " + amount + " using PayPal: " + email);
	        } else {
	            System.err.println("Insufficient balance in PayPal. Please update your email or account.");
	        }
	    }
	 }