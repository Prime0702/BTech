#include <iostream>
using namespace std;
class DF;
class DM{
    public:
        int meter, centimeter;
        DM(){
            meter = 0;
            centimeter = 0;
        }
        DM(int m, int cm){
            meter = m;
            centimeter = cm;
        }
        friend float sum(DM a, DF b);
};
class DF{
    public:
        int feet, inch;
        DF(){
            feet = 0;
            inch = 0;
        }
        DF(int f, int i){
            feet = f;
            inch = i;
        }
        friend float sum(DM a, DF b);
};
float sum(DM a, DF b){
    float x,y,sum;
    x = a.meter + a.centimeter/100.0;
    y = b.feet + b.inch/12.0;
    sum = x + y*0.304;
    return sum;
}
int main(){
    DM a(1, 2);
    DF b(3, 4);
    cout << sum(a, b) << endl;
    return 0;
}