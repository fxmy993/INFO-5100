package edu.northeastern.fxmy;

public class LuxuryCar extends BasicCar implements Car{

    public LuxuryCar(BasicCar basicCar) {
//        super(basicCar);
        this.s = basicCar.s + " Adding features of Luxury Car.";

    }

    @Override
    public void assemble() {
        System.out.println(s);
    }
}
