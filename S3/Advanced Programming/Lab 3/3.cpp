#include <iostream>
#include <stack>
using namespace std;
stack<int> sortStack(stack<int> &s){
    stack<int> tmpStack;
    while (!s.empty()){
        int tmp=s.top();
        s.pop();
        while (!tmpStack.empty() && tmpStack.top()<tmp){
            s.push(tmpStack.top());
            tmpStack.pop();
        }
        tmpStack.push(tmp);
    }
    return tmpStack;
}
int main(){
    stack<int> s;
    s.push(34);
    s.push(3);
    s.push(31);
    s.push(98);
    s.push(92);
    s.push(23);
    stack<int> tmpStack=sortStack(s);
    cout<<"Sorted numbers are: ";
    while (!tmpStack.empty()){
        cout<<tmpStack.top()<<" ";
        tmpStack.pop();
    }
    cout<<endl;
    return 0;
}