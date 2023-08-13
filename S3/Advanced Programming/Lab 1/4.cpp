#include <iostream>
#include <cmath>
using namespace std;
class Solid{
    private:
        float volume;
    public:
        void calc(int a){
            volume = a*a*a;
        }
        void calc(float r){
            volume = 4/3*M_PI*r*r*r;
        }
        void calc(int a, int b, int c){
            volume = a*b*c;
        }
        void calc(float r, float h){
            volume = M_PI*r*r*h;
        }
        void display(){
            cout << "Volume: " << volume << endl;
        }
};
int main(){
    Solid x;
    cout<<"Cube: ";x.calc(5);x.display();
    cout<<"Sphere: ";x.calc(float(5.5));x.display();
    cout<<"Cylinder: ";x.calc(5.0,10.0);x.display();
    cout<<"Rectangular Box: ";x.calc(2,3,5);x.display();
}