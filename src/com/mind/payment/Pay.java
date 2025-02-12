package com.mind.payment;

import java.util.Scanner;

public class Pay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        Product product = new Product();
        
      
        System.out.println("Choose a payment method (CreditCard/PayPal): ");
        String paymentMethodType = scanner.nextLine();
        
        String identifier = "";
        PaymentMethod paymentMethod = null;

      
        if (paymentMethodType.equalsIgnoreCase("CreditCard")) {
            System.out.println("Enter your Credit Card number: ");
            identifier = scanner.nextLine();
            paymentMethod = PaymentMethodFactory.createPaymentMethod("CreditCard", identifier);
        } else if (paymentMethodType.equalsIgnoreCase("PayPal")) {
            System.out.println("Enter your PayPal email: ");
            identifier = scanner.nextLine();
            paymentMethod = PaymentMethodFactory.createPaymentMethod("PayPal", identifier);
        } else {
            System.out.println("Invalid payment method selected!");
            scanner.close();
            return;
        }
        
        
        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getAmount());
        
        
        System.out.println("Do you want to pay or cancel? (pay/cancel): ");
        String decision = scanner.nextLine();
        
        if (decision.equalsIgnoreCase("pay")) {
       
            if (paymentMethod.hasSufficientBalance(product.getAmount())) {
                
                paymentMethod.pay(product.getAmount());
            } else {

                System.err.println("Insufficient balance. Would you like to switch payment method? (yes/no): ");
                String switchMethod = scanner.nextLine();
                
                if (switchMethod.equalsIgnoreCase("yes")) {
                   
                    System.out.println("Choose a new payment method (CreditCard/PayPal): ");
                    String newPaymentMethodType = scanner.nextLine();

                   
                    if (newPaymentMethodType.equalsIgnoreCase("CreditCard")) {
                        System.out.println("Enter your new Credit Card number: ");
                        identifier = scanner.nextLine();
                        if (paymentMethod instanceof CreditCard) {
                            ((CreditCard) paymentMethod).setCardNumber(identifier); 
                        }
                    } else if (newPaymentMethodType.equalsIgnoreCase("PayPal")) {
                        System.out.println("Enter your new PayPal email: ");
                        identifier = scanner.nextLine();
                        if (paymentMethod instanceof PayPal) {
                            ((PayPal) paymentMethod).setEmail(identifier);  
                        }
                    }

                 
                    System.out.println("Product: " + product.getName());
                    System.out.println("Price: $" + product.getAmount());
                    System.out.println("Proceeding with updated payment method...");
                    
                    if (paymentMethod.hasSufficientBalance(product.getAmount())) {
                        paymentMethod.pay(product.getAmount());
                    } else {
                        System.out.println("New payment method also has insufficient balance. Payment failed.");
                    }
                } else {
                  
                    System.out.println("Payment has been canceled.");
                }
            }
        } else if (decision.equalsIgnoreCase("cancel")) {

            System.out.println("Payment has been canceled.");
        } else {
            System.out.println("Invalid option. Please choose 'pay' or 'cancel'.");
        }
        
        scanner.close();
    }
}
