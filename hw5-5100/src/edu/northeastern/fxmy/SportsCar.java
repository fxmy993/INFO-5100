package edu.northeastern.fxmy;

public class SportsCar extends BasicCar implements Car{

    public SportsCar(BasicCar basicCar) {
//        super(basicCar);
        this.s =basicCar.s +  " Adding features of Sports Car.";
    }

    @Override
    public void assemble() {
        System.out.println(s);
    }

}
