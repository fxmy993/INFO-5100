package edu.northeastern.fxmy;

public class BasicCar implements Car{

    protected String s;

    public BasicCar(){
        this.s = "Basic Car.";
    }
    @Override
    public void assemble() {
        System.out.println(s);
    }
}
