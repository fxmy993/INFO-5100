package edu.northeastern.fxmy;

public class Happy extends Moody{

    //returns string indicating happy
    @Override
    public String getMood(){

        return "I feel happy Today";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”

    //returns message about self: “Subject laughs a lot”
    public String toString(){

        return "Subject laughs a lot";
    }
}
