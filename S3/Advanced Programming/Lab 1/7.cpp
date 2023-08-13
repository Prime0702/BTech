#include <iostream>
#include <cmath> 
#include <cstring> 
using namespace std; 
class account{ 
    protected: 
        char name[20]; 
        int accno; 
        int bal; 
    public: 
        account(){ 
        strcpy(name," "); 
        accno=0; 
        bal=0; 
        } 
        void input() { 
            cout<<"Enter the name of the Account Holder: ";cin>>name; 
            cout<<"Enter the Account Number: ";cin>>accno; 
            cout<<"Enter the Balance: ";cin>>bal; 
        } 
        void display(){ 
            cout<<"Customer Name: "<<name<<endl; 
            cout<<"Account Number: "<<accno<<endl; 
            cout<<"Balance: "<<bal<<endl; 
        } 
        void deposit(){ 
            int amount; 
            cin>>amount; 
            bal+=amount; 
        } 
}; 
class savings:public account{ 
    int interest; 
    public: 
        savings(){ 
            strcpy(name," "); 
            accno=0; 
            bal=0; 
        } 
        int compound() 
        { 
            int years,rate; 
            rate=10; 
            cout<<"Enter the duration for the deposit: ";cin>>years; 
            interest=bal*pow(1+rate/100.0,years)-bal; 
            return interest; 
        } 
        void update(){bal+=compound();} 
        void withdrawal(){ 
            int amount; 
            cin>>amount; 
            if(bal>=amount)bal-=amount; 
            else cout<<"Insufficient balance"<<endl; 
        } 
}; 
class current:public account{ 
    int cheque; 
    int fine; 
    public: 
        current(){ 
            strcpy(name," "); 
            accno=0; 
            bal=0; 
        } 
        int min(){ 
            int ret1=1; 
            if(bal<=500){ 
                fine=50; 
                bal=bal-fine; 
                ret1=0; 
            } 
            else cout<<"No fine is imposed"<<endl; 
            return ret1; 
        } 
        void withdrawal(){ 
            int amount; 
            cin>>amount; 
            int k=min(); 
            if(k==1){ 
                if(bal>=amount) 
                    bal=bal-amount; 
            } 
            else cout<<"The amount cannot be withdrawn"<<endl; 
        } 
}; 
int main() 
{ 
    savings a; 
    current b; 
    cout<<"Input the Details of the Savings Account"<<endl;a.input(); 
    cout<<"Enter the amount to be deposited"<<endl;a.deposit(); 
    cout<<"Current status of the Account"<<endl;a.display(); 
    cout<<"Enter the Amount to be withdrawn"<<endl;a.withdrawal(); 
    cout<<"Current status of the Account"<<endl;a.display(); 
    cout<<"Input the Details of the Current Account"<<endl;b.input(); 
    cout<<"Enter the amount to be deposited"<<endl;b.deposit(); 
    cout<<"Current status of the Account"<<endl;b.display(); 
    cout<<"Enter the Amount to be withdrawn"<<endl;b.withdrawal(); 
    cout<<"Current status of the Account"<<endl;b.display(); 
    return 0; 
}