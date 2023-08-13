#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
bool cmp(const pair<string,int> &a,const pair<string,int> &b){
    return a.second<b.second;
}
int main(){
    map<string,int> m1;
    map<string,int>::iterator i;
    map<string,int>::reverse_iterator j;
    m1.emplace("Aadithyan",10001);
    m1.emplace("Aaditya",10002);
    m1.emplace("Abhijith",10003);
    m1.emplace("Abhinav",10004);
    m1.emplace("Abhishek",10005);
    m1.emplace("Arun",10006);
    cout<<"Name Ascending Order"<<endl;
    for(i=m1.begin();i!=m1.end();i++)cout<<(*i).first<<" "<<(*i).second<<endl;
    cout<<"Name Descending Order"<<endl;
    for(j=m1.rbegin();j!=m1.rend();j++)cout<<(*j).first<<" "<<(*j).second<<endl;
    cout<<"Roll Number Ascending Order"<<endl;
    vector<pair<string,int> > v(m1.begin(),m1.end());
    sort(v.begin(),v.end(),cmp);
    for(auto const &i : v)cout<<i.first<<" "<<i.second<<endl;
    cout<<"Roll Number Descending Order"<<endl;
    sort(v.rbegin(),v.rend(),cmp);
    for(auto const &i : v)cout<<i.first<<" "<<i.second<<endl;
    return 0;
}