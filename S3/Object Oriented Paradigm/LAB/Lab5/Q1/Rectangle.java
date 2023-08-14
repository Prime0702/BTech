package LS5.Q1;

public class Rectangle {
    private double length;
    private double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}
