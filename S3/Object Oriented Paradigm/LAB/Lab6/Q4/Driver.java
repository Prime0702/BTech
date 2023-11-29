/*
Practice Lab Assignment IV, Execute the below program and write the observation.Append a member function SumofAntiDiagonal​​​​​​​ which will return the sum of elements of the anti diagonals of the input matrix
 */
package LS6.Q4;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		System.out.println("Enter Row and column of the matrix");
		Scanner in = new Scanner(System.in);  
		int row=in.nextInt();
		int col=in.nextInt();
		Array myobj=new Array(row,col);
        myobj.Display(row,col);
		in.close();
        System.out.println("Anti Diagonal Sum: "+myobj.SumofAntiDiagonal(row, col));
	}
}
