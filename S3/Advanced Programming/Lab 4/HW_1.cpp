#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    map<string, int> m;
    int n,t,q;cin>>n;string k;
    for(int i=0;i<n;i++){
        cin>>t;
        if(t==1){
            cin>>k>>q;
            map<string,int>::iterator itr=m.find(k);
            if(itr!=m.end()){
                int temp=m[k];
                m.erase(k);
                m.insert(make_pair(k,(q+temp)));
            }
            else m.insert(make_pair(k,q));
        }
        else if(t==2){
            cin>>k;
            m.erase(k);
        }
        else if(t==3){
            cin>>k;
            map<string,int>::iterator itr=m.find(k);
            if(itr!=m.end())cout<<m[k]<<endl;
            else cout<<"0"<<endl;
        }
    } 
    return 0;
}



