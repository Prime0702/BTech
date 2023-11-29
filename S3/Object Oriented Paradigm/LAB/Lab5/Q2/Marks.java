package LS5.Q2;

public abstract class Marks {
    double mark1,mark2,mark3,mark4;
    Marks(double m1,double m2,double m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
        mark4=0;
    }
    Marks(double m1,double m2,double m3,double m4){
        mark1=m1;
        mark2=m2;
        mark3=m3;
        mark4=m4;
    }
    public abstract double getPercentage();
}
