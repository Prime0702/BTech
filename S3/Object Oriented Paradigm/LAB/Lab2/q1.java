/*
 * Create a Java Program that will read your 
 * a.Name {use in.next()}
 * b.Full Name {use in.nextLine()}
 * c.Age{use in.nextInt()}
 * d.Address{use in.nextLine()}
 * e.Height{use in.nextDouble()}
 * f.Marks {use in.nextFloat()}
 */
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your full name: ");
        String fullName = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your address: ");
        String address = in.nextLine();
        System.out.print("Enter your height: ");
        double height = in.nextDouble();
        System.out.print("Enter your marks: ");
        float marks = in.nextFloat();
        in.close();
    }
}
