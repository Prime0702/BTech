package LS5.Q3;
/*
 * Q3. Calculate the area of a rectangle, a square, and a circle. 
 * Create an abstract class 'Shape' with three abstract methods, namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
 * The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
 * Create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of a rectangle, square and circle, respectively. 
 * Create an object of class 'Area' and call all three methods.
 */
public class driver {
    public static void main(String[] args) {
        Area sh = new Area();
        System.out.println("Area of Rectangle: "+ sh.RectangleArea(3,5));
        System.out.println("Area of Square: "+sh.SquareArea(5));
        System.out.println("Area of Circle: "+sh.CircleArea(10));
    }
    
}
