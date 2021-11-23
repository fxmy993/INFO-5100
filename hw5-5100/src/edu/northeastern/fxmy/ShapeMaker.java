package edu.northeastern.fxmy;

public class ShapeMaker implements Shape{

    Shape circle = new Circle();
    Shape square = new Square();
    Shape rectangle = new Rectangle();
    public ShapeMaker(){

    }
    @Override
    public void draw() {

    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
