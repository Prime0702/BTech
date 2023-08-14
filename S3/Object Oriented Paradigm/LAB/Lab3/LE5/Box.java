package LS3.LE5;

public class Box {
	
    private double width;
    double height;
    public double depth;


    double volume() //Method for computing Volume
    {
        return(width*height*depth);
    }

    void getwidth(int w)
    {
        width=w;
    }

}
