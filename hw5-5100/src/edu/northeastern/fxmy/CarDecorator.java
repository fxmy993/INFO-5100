package edu.northeastern.fxmy;

public class CarDecorator extends BasicCar implements Car{
    protected BasicCar car = null;
    protected  String s = "CarDecorator";


    public CarDecorator(BasicCar basicCar){
        car = basicCar;
        this.s = basicCar.s;
    }



    @Override
    public void assemble() {
        System.out.println(car.s);
    }
}
