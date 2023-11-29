package LS5.Q3;

public class Area extends Shape {
    public  double RectangleArea(double length,double breadth){
        return length*breadth;
    };
    public  double SquareArea(double side){
        return side*side;
    };
    public  double CircleArea(double radius){
        return radius*radius*pi;
    };
}
