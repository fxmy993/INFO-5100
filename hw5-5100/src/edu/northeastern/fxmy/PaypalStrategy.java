package edu.northeastern.fxmy;

public class PaypalStrategy implements PaymentStrategy{

    public String email;
    public PaypalStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(int a) {
        System.out.println("Paypal : $" + a);
    }
//    email : String
//
//    PayPal(String)
//    pay(int) : void

}
