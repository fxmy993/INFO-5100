package edu.northeastern.fxmy;

public class Square extends Shape{

    public int side;

    public Square(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Square(String name, String color, int perimeter, int area) {
        super(name, color, perimeter, area);
    }

    public Square(int side){
        this.side = side;
    }

    public Square(String name,String color,int side){
        this.side = side;
        this.name = name;
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (side*side);
    }

    @Override
    public int getPerimeter() {
        return 4*side;
    }
}
