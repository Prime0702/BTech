/*
 * Create a Java program to find sum of
 * a.Two integers
 */
import java.util.Scanner;
public class q3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = in.nextInt();
        System.out.print("Enter B: ");
        int b = in.nextInt();
        in.close();
        System.out.println("Sum: " + (a + b));
        in.close();
    }
}
