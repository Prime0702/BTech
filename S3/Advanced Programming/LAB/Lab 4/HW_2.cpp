#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    set<int>s; 
    int q;cin>>q;
    for(int i=0;i<q;i++){
        int t,val;cin>>t>>val;
        if(t==1)s.insert(val);
        else if(t==2)s.erase(val);
        else{
            set<int>::iterator itr=s.find(val);
            if(itr==s.end())cout<<"No"<<endl;
            else cout<<"Yes"<<endl;
        }
    }   
    return 0;
}



