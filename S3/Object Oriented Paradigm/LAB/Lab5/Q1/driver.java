package LS5.Q1;
/*
 * Q1. Create a class named 'Rectangle' with two data members, 'length' and 'breadth,' and two methods to print the area and perimeter of the rectangle, respectively. 
 * Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. 
 * Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class 'super(s,s)'. 
 * Print the area and perimeter of a rectangle and a square.
 */
public class driver {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3, 5);
        Square squ1 = new Square(5);
        System.out.println("Area of rectangle: "+ rec1.area());
        System.out.println("Peremeter of rectangle: "+ rec1.perimeter());
        System.out.println("Area of square: "+squ1.area());
        System.out.println("Peremeter of square: "+squ1.perimeter());
    }
}
