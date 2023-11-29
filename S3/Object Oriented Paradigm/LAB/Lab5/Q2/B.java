package LS5.Q2;

public class B extends Marks {
    B(double Mark1,double Mark2,double Mark3,double Mark4){
        super(Mark1, Mark2, Mark3, Mark4);
    }
    public double getPercentage(){
        return (mark1+mark2+mark3+mark4)/4;
    }
}
