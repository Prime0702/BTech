package LS4.q2;
class Rectangle{
    private double lenght;
    private double breadth;
    Rectangle(double a,double b){
          lenght=a;
          breadth=b;
    }
    double area(){
        return lenght*breadth;
    }
    double perimeter(){
        return 2*(lenght+breadth);

    }
}