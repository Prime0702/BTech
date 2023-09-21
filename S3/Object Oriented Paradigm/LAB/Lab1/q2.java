/*
 * Write a Simple program to check the number is prime  
 * Note : have a variable num = 3  
 * Output should be 3 is a prime number 
 * Change the value of num = 4  
 * Output should be 4 is not a prime number  
 * Change the values of num in the program and test the program 
 */
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }
}
