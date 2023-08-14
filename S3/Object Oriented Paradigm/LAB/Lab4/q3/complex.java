package LS4.q3;
class complex{
    private double real;
    private double imag;
    public complex(double r, double i){
        real = r;
        imag = i;
    }
    public complex(){
        real = 0;
        imag = 0;
    }
    public void setReal(double r){
        real = r;
    }
    public void setImag(double i){
        imag = i;
    }
    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }
    public void display(){
        System.out.println(real + " + " + imag + "i");
    }
    public complex add(complex c){
        complex temp = new complex();
        temp.real = real + c.real;
        temp.imag = imag + c.imag;
        return temp;
    }
    public complex sub(complex c){
        complex temp = new complex();
        temp.real = real - c.real;
        temp.imag = imag - c.imag;
        return temp;
    }
}