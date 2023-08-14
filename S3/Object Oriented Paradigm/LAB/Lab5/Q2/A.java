package LS5.Q2;

public class A extends Marks{
    A(double Mark1,double Mark2,double Mark3){
        super(Mark1, Mark2, Mark3);
    }
    public double getPercentage(){
        return (mark1+mark2+mark3)/3;
    }
}
