#include <iostream>
using namespace std;
class Rectangle{
    private:
        int length, breadth;
    public:
        Rectangle(int l, int b){
            length = l;
            breadth = b;
        }
        Rectangle(Rectangle &r){
            length = r.length;
            breadth = r.breadth;
        }
        Rectangle(){
            length = 6;
            breadth = 7;
        }
        int area(){
            return length * breadth;
        }
        ~Rectangle(){
            cout << "Destructor" << endl;
        }
};
int main(){
    Rectangle r1(10, 5);
    cout << r1.area() << endl;
    Rectangle r2(r1);
    cout << r2.area() << endl;
    Rectangle r3;
    cout << r3.area() << endl;
    return 0;
}