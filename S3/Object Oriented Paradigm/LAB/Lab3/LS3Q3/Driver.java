package LS3.LS3Q3;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Student[] obj;
        obj=new Student[N];
        String temp;
        temp=in.nextLine();
        for (int i=0; i<N; i++){
            obj[i] = new Student();
            System.out.println("Student "+(i+1));
            System.out.print("Enter Name: ");obj[i].Name=in.nextLine();
            System.out.print("Enter Rollno: ");obj[i].Rollno=in.nextInt();
            System.out.print("Enter Cgpa: ");obj[i].Cgpa=in.nextFloat();temp=in.nextLine();
            System.out.print("Enter Batch: ");obj[i].Batch=in.nextLine();
        }
        //part a
        System.out.println("Search");
        System.out.print("Enter Rollno: ");int x=in.nextInt();
        int flag=1;
        for (int i=0; i<N; i++){
            if (obj[i].Rollno==x){System.out.println("Name: " + obj[i].Name);flag=0;break;}
        }
        if(flag==1){System.out.print("Rollno. not found.");}
        //part b
        System.out.print("Enter Rollno: ");x=in.nextInt();
        flag=1;
        for (int i=0; i<N; i++){
            if (obj[i].Rollno==x){
                System.out.print("Enter CGPA: ");
                flag=0;obj[i].Cgpa=in.nextFloat();
                System.out.println("NAME: "+obj[i].Name+"\nROLLNO: "+obj[i].Rollno+"\nCGPA: "+obj[i].Cgpa+"\nBatch: "+obj[i].Batch);
            }
        }
        if(flag==1){System.out.print("Rollno. not found.");}
        in.close();
    }
}
