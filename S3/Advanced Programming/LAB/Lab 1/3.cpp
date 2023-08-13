#include <iostream>
using namespace std;
class Counter{
    private:
        int cnt;
    public:
        Counter(){
            cnt = 0;
        }
        void init(){
            cout << "Enter count: ";
            cin >> cnt;
        }
        void count(){
            cnt++;
        }
        void display(){
            cout << "Count: " << cnt << endl;
        }
};
int main(){
    Counter c;
    int ch = 0;
    while(ch != 4){
        cout << "1. Initialize\n2. Count\n3. Display\n4. Exit\nEnter choice: ";
        cin >> ch;
        switch(ch){
            case 1:
                c.init();
                break;
            case 2:
                c.count();
                break;
            case 3:
                c.display();
                break;
            case 4:
                break;
            default:
                cout << "Invalid choice" << endl;
        }
    }
}