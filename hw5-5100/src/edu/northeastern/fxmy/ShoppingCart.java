package edu.northeastern.fxmy;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<Item, Integer> map = new HashMap<Item, Integer>();
    public ShoppingCart(){

    }
    public void addItem(Item item){
        map.put(item,map.getOrDefault(item,0)+1);
    }

    public void removeItem(Item item){
        if(!map.containsKey(item))
            return;
        map.put(item,map.get(item)-1);
    }

    public int calculateTotal(){

        int count = 0;
        for(Item item: map.keySet()){
            count+=item.getPrice()*map.get(item);
        }
        return count;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
//    addItem(Item) : void
//    removeItem(Item) : void
//    calculateTotal() : int
//    pay(PaymentStrategy) : void
}
