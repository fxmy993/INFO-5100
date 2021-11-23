package edu.northeastern.fxmy;

public class Item {

    public String Id;
    public int price;

    public Item(String Id, int price){
        this.Id = Id;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
