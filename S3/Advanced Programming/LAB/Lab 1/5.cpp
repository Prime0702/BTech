#include <iostream>
using namespace std;
const char ESC = 27;
const double toll = 0.5;
class TollBooth{
    private:
        unsigned int totalCars;
        double totalMoney;
    public:
        TollBooth(){
            totalCars = 0;
            totalMoney = 0;
        }
        void payingCar(){
            totalCars++;
            totalMoney += toll;
        }
        void nopayCar(){
            totalCars++;
        }
        void display(){
            cout << "Total cars: " << totalCars << endl;
            cout << "Total money: " << totalMoney << endl;
        }
};
int main(){
    TollBooth x;
    char c;
    do {
        cout << "Press 1 for paying car, 2 for non-paying car, 3 for display, ESC to exit: ";
        cin >> c;
        switch (c){
            case '1':
                x.payingCar();
                break;
            case '2':
                x.nopayCar();
                break;
            case '3':
                x.display();
                break;
            case ESC:
                break;
            default:
                cout << "Invalid input!" << endl;
                break;
        }
    } while (c != ESC);
}
