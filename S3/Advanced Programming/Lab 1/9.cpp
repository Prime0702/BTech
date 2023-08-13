#include <iostream>
using namespace std; 
class Engineer; 
class Doctor; 
class incometax{ 
    friend class Engineer; 
    friend class Doctor; 
    private: 
        double tax; 
}; 
class Engineer{ 
    public: 
        int salary; 
        Engineer(){ 
        salary=25000; 
        } 
        void display(incometax& b,int a){ 
        cout<<"The salary of the person is "<<a<<endl; 
        cout<<"Tax to be paid is "<<b.tax<<endl; 
        } 
        void calctax(incometax& a,int b){ 
        a.tax=b*0.10; 
        } 
}; 
class Doctor{ 
    public: 
        int salary; 
        Doctor(){ 
        salary=30000; 
        } 
        void calctax(incometax& a,int b){ 
        a.tax=b*0.10; 
        } 
        void display(incometax& b,int a){
        cout<<"The salary of the person is "<<a<<endl; 
        cout<<"Tax to be paid is "<<b.tax<<endl; 
        } 
}; 
int main(){ 
    incometax c; 
    Engineer a; 
    Doctor b; 
    a.calctax(c,a.salary); 
    a.display(c,a.salary); 
    b.calctax(c,b.salary); 
    b.display(c,b.salary); 
    return 0; 
}