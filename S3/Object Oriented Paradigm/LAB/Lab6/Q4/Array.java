package LS6.Q4;
import java.util.Scanner;
public class Array {
    int[][] intArray; 
    Array(int row,int col)
    {
    	intArray= new int[row][col];
    	Scanner in = new Scanner(System.in);  
    	System.out.println("Enter the elements");
    	for (int i=0; i<row; i++)
            {
    		    for (int j=0; j<col; j++)
    	        {
    			    intArray[i][j] = in.nextInt();
    	        }
            }
        in.close();
    }
    void Display(int row,int col)
    {
    	for (int i=0; i<row; i++)
            {
    		    for (int j=0; j<col; j++)
    	        {
    	            System.out.print( intArray[i][j]+ " ");
    	        }
    		    System.out.println(" ");
            }
    }
	int SumofAntiDiagonal(int row,int col){
        int rv=0;
        for (int i=0; i<row; i++)
            {
    		    for (int j=0; j<col; j++)
    	        {
    	            if(j+i==col-1)rv+=intArray[i][j];
                }
            }
        return rv;
    }	
}
