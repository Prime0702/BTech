package LS6.Q3;

public class Student {
	int rollno;
	String name;
	//2
    double m1,m2,m3;
	Student(int R, String S, double Mark1, double Mark2, double Mark3)
	{
		rollno=R;
		name=S;
        //2
        m1=Mark1;
        m2=Mark2;
        m3=Mark3;
	}
	void setData(int R,String S)
	{
		rollno=R;
		name=S;
	}
	void ShowData()
	{
		System.out.print("Roll No = "+rollno + "  " + " Student Name = "+name);
        System.out.println();
	}
    //2
    void grade(){
        double tmp=(m1+m2+m3)/3;
        if (tmp>90)System.out.println("A+");
        else if (tmp>80)System.out.println("A");
        else if (tmp>70)System.out.println("B+");
        else if (tmp>60)System.out.println("B");
        else if (tmp>50)System.out.println("C");
        else if (tmp>40)System.out.println("D");
        else System.out.println("F");
    }
}
