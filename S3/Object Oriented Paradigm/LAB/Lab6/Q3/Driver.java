/*

Practice Lab Assignment III- Execute the below program of Array of Objects( Student Details). Append the following functionalities

1) Have a functionality to sort the student array based on roll no

2) Have marks of 3 subjects as data members, and have a functionality to assign grade to each student based on the total marks of 3 subjects. Assign suitable grade ranges

 */
package LS6.Q3;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		System.out.println("Enter No of students");
		Scanner in = new Scanner(System.in);  
		int size=in.nextInt();
		Student[] myobj=new Student[size];
		int R;
        double m1,m2,m3;
		String S;
		for (int i=0;i<size;i++)
		{    
		    System.out.println("Enter the next student details(rollno first_name mark1 mark2 mark3");
		    R = in.nextInt();
		    S = in.next();
            m1=in.nextInt();
            m2=in.nextInt();
            m3=in.nextInt();
		    myobj[i]= new Student(R,S,m1,m2,m3); 
	    }   
		System.out.println("Display Student Details");
		for (int i=0;i<size;i++){myobj[i].ShowData();}
        in.close();
        //1
        System.out.println("Sorted Student Details");
        for (int i = 0; i < size - 1; i++)for (int j = 0; j < size - i - 1; j++)if (myobj[j].rollno > myobj[j + 1].rollno){
            Student temp = myobj[j];
            myobj[j] = myobj[j + 1];
            myobj[j + 1] = temp;
        }
        for (int i=0;i<size;i++){
            myobj[i].ShowData();
            myobj[i].grade();
        }
    }
}
