/*
 * Write a program to Reverse a Number in Java 
 * Note : have a variable n = 12345 
 * Output should be 54321  
 * Change the values of n in the program and test the program 
 */
public class q5 {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse is: " + rev);
    }
}
