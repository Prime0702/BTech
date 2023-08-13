#include <iostream>
#include <queue>
using namespace std;
int main(){
    //a
    queue<int> q1;
    //b
    cout<<q1.empty()<<endl;
    //c
    q1.emplace(3);
    q1.emplace(6);
    q1.emplace(7);
    //d
    queue<int> q2;
    q1.swap(q2);
    //e
    while (!q2.empty()){
        cout<<q2.front()<<" ";
        q2.pop();
    }
    cout<<endl;
    //f
    q1.push(10);
    q1.push(20);
    q1.push(30);
    q1.push(40);
    q1.push(50);
    //g
    q1.swap(q2);
    //h
    while (!q1.empty()){
        q2.push(q2.front());
        q1.pop();
    }
    //i
    cout<<"size of q1: "<<q1.size()<<endl;
    cout<<"size of q2: "<<q2.size()<<endl;
    return 0;
}