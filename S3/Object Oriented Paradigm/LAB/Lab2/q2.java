/*
 * Modify the above program to print back the details in a formatted way:
 * a.Name:Amrita 
 * b.Full Name: Amrita Vishwa
 * c.Age:20
 * d.Address:Amrita Vishwa Vidyapeetham, Amritapuri Campus
 * e.Height:150.55 cm
 * f.Marks: 91.53
 */
import java.util.Scanner;
public class q2 {
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
        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Height: " + height +" cm");
        System.out.println("Marks: " + marks);
    }
}
