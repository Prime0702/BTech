#include <iostream>
using namespace std;
class Complex{
    private:
        int real, imag;
    public:
        Complex(int r = 0, int i = 0){
            real = r;
            imag = i;
        }
        Complex operator+(Complex const &obj){
            Complex res;
            res.real = real + obj.real;
            res.imag = imag + obj.imag;
            return res;
        }
        int getReal(){
            return real;
        }
        int getImag(){
            return imag;
        }
        void print(){
            cout << real << " + i" << imag << endl;
        }
        Complex operator*(Complex const &obj){
            Complex res;
            res.real = real * obj.real - imag * obj.imag;
            res.imag = real * obj.imag + imag * obj.real;
            return res;
        }
};
int main(){
    Complex a = Complex(3, 4);
    Complex b = Complex(5, 12);
    Complex c = a + b;
    Complex d = a * b;
    c.print();
    d.print();
    return 0;
}