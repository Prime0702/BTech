/*
 * Write a simple program without using recursion 
 * Note: Have a variable count in the program which is initialised to say 10. 
 * Output should be 0 1 1 2 3 5 8 13 21 34 
 * Change the values of count in the program and test the program
 */
import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for(int i = 0; i < count - 2; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
        System.out.println();
    }
}