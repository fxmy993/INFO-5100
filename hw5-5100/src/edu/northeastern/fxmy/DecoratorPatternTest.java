package edu.northeastern.fxmy;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        BasicCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();

        BasicCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
