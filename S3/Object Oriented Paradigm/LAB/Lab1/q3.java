/*
 * Write a Simple program to find the factorial of a number  
 * Note : have a variable n = 5  
 * Output should be Factorial of 5 is : 120 
 * Change the values of n in the program and test the program 
 */
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
