package LS6.Q2;
import java.util.Scanner;

public class Array {
	
	int[]myList;
	
	Array(int size)
	{
		myList=new int[size];
		Scanner in = new Scanner(System.in);  
		System.out.println("Enter the elements");
		for (int i=0; i<size; i++)
	      {
	    	  myList[i] = in.nextInt();
	      }
        in.close();
	}
	
	void Display()
	{
		for(int i=0; i < myList.length; i++) 
		    System.out.println( myList[i] );
		
	}
	
    int OddSum(){
        int rv=0;
        for(int i=0; i < myList.length; i++)if(myList[i]%2!=0)rv+=myList[i];
        return rv;
    }

}
