package edu.northeastern.fxmy;

public class CreditCardStrategy implements PaymentStrategy{

    public String cardNumber;

    public CreditCardStrategy(String cardNumber){

    }

    @Override
    public void pay(int a) {
        System.out.println("CreditCard : $" + a);
    }
//    cardNumber : String
//
//    CreditCard(String)
//    pay(int) : void
}
