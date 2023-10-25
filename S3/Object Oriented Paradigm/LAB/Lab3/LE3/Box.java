package LS3.LE3;


public class Box {
	double width;
	double height;
	double depth;

    void setDim(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    double volume()
    {
    	return(width*height*depth);
    }
}
