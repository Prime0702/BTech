#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int pos,start,end,n,a;
    cin>>n;
    vector<int>v;
    for(int i=0;i<n;i++){
        cin>>a;
        v.push_back(a);
    }   
    cin>>pos>>start>>end;
    v.erase(v.begin()+(pos-1));
    v.erase(v.begin()+start-1,v.begin()+end-1);
    cout<<v.size()<<endl;
    for(int i=0;i<v.size();i++)cout<<v[i]<<" ";
    return 0;
}
