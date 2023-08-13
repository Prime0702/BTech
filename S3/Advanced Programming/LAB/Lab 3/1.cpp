#include <iostream>
#include <vector>
#include <deque>
using namespace std;
int main(){
    vector<int> v1;
    vector<int>::iterator i;
    for(int i=1;i<=10;i++)v1.push_back(i);
    cout<<"elements after pushback: ";
    for(i=v1.begin();i!=v1.end();i++)cout<<*i<<" ";cout<<endl;
    for(int i=0;i<5;i++)v1.pop_back();
    cout<<"elements after popback: ";
    for(i=v1.begin();i!=v1.end();i++)cout<<*i<<" ";cout<<endl;
    deque<int> d1;
    deque<int>::iterator j;
    for(int i=11;i<=20;i++)d1.push_back(i);
    cout<<"elements after pushback: ";
    for(j=d1.begin();j!=d1.end();j++)cout<<*j<<" ";cout<<endl;
    cout<<"elements after pushfront: ";
    for(int i=10;i>=1;i--)d1.push_front(i);
    for(j=d1.begin();j!=d1.end();j++)cout<<*j<<" ";cout<<endl;
    cout<<"elements after popback: ";
    for(int i=0;i<5;i++)d1.pop_back();
    for(j=d1.begin();j!=d1.end();j++)cout<<*j<<" ";cout<<endl;
    cout<<"elements after popfront: ";
    for(int i=0;i<5;i++)d1.pop_front();
    for(j=d1.begin();j!=d1.end();j++)cout<<*j<<" ";cout<<endl;
    return 0;
}