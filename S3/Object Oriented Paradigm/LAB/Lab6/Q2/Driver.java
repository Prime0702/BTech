/*
 * ​​​​​​​Practice lab assigment- II- Execute the below program. Append a member function OddSum() which will sum odd numbers in the list 
 */
package LS6.Q2;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter limit");
		Scanner in = new Scanner(System.in);  
		int size=in.nextInt();
		Array myobj=new Array(size);
        myobj.Display();
		in.close();
        System.out.println("Odd Sum: "+myobj.OddSum());
        
	}

}
