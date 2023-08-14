/*
 * Create a Java program to find sum of
 * b.Two Double valued numbers
 */
import java.util.Scanner;
public class q3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = in.nextDouble();
        System.out.print("Enter B: ");
        double b = in.nextDouble();
        in.close();
        System.out.println("Sum: " + (a + b));
        in.close();
    }
}
