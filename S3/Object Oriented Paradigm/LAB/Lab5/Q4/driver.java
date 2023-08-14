package LS5.Q4;
/*
 * Q4. Create an interface Polygon with a method void getArea( ) which takes two integer parameters. 
 * Create a class Rectangle that uses this interface to find the area of the rectangle by using proper member variables.
 */
public class driver {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea(3, 5);
    }
}
