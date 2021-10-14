package edu.northeastern.fxmy;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(int side){
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color,int width,int height){
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return (width*height);
    }
    @Override
    public int getPerimeter() {
        return (2*(width+height));
    }
}
