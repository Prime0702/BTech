package LS3.LS3Q4;
import java.lang.Math;
public class animal {
    private int cat_A;
    private int cat_B;
    private int mouse;
    public void catAndMouse(int a,int b, int c){
        cat_A=a;
        cat_B=b;
        mouse=c;
    }
    public void catMouseDemo(){
        if (Math.abs(cat_B-mouse)>Math.abs(cat_A-mouse)){System.out.println("Cat A");}
        else if (Math.abs(cat_B-mouse)<Math.abs(cat_A-mouse)){System.out.println("Cat B");}
        else System.out.println("Mouse");
    }
}
