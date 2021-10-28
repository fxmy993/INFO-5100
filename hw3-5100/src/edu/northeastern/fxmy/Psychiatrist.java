package edu.northeastern.fxmy;

public class Psychiatrist {

    //asks moody object about its mood
    public void examine(Moody moodyObject){

        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());
        System.out.println();

    }
    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject){

        moodyObject.ExpressFeelings();
        System.out.println("Observation: "+moodyObject.toString());
        System.out.println();
    }
    //returns message about self: “Subject laughs a lot”

}
