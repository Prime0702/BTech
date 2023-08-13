#include <iostream>
#include <queue>
#include <array>
using namespace std;
int main() {
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n,z,c=0;
        cin>>n>>z;
        priority_queue <int> a;
        for(int i=0;i<n;i++){
            int v;
            cin>>v;
            a.push(v);
        }
        while(z>0 && !a.empty()){
            int attack=a.top();
            a.pop();
            z-=attack;
            attack/=2;
            if(attack>0)
                a.push(attack);
            c++;
        }
        if(z>0)
            cout<<"Evacuate"<<endl;
        else
            cout<<c<<endl;
    }
}