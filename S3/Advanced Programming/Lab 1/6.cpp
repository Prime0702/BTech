#include <iostream>
using namespace std;
class Time{
    private:
        int hour, minute, second;
    public:
        Time(){
            hour = 0;
            minute = 0;
            second = 0;
        }
        Time(int h, int m, int s){
            hour = h;
            minute = m;
            second = s;
        }
        void display(){
            cout << hour << ":" << minute << ":" << second << endl;
        }
        Time operator+(Time t){
            Time temp;
            temp.second = second + t.second;
            if (temp.second >= 60){
                temp.second -= 60;
                temp.minute++;
            }
            temp.minute += minute + t.minute;
            if (temp.minute >= 60){
                temp.minute -= 60;
                temp.hour++;
            }
            temp.hour += hour + t.hour;
            return temp;
        }
};
int main(){
    Time t1(1, 2, 3), t2(4, 5, 6), t3;
    t1.display();
    t2.display();
    t3 = t1 + t2;
    t3.display();
    return 0;
}