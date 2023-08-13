#include <iostream>
#include <set>
using namespace std;
int main(){
    set<pair <int,int> > s;
    int count=0,cnt=0;
    s.insert(make_pair(1,9));
    s.insert(make_pair(10,20));
    s.insert(make_pair(21,40));
    s.insert(make_pair(41,60));
    s.insert(make_pair(61,80));
    s.insert(make_pair(81,100));
    int a[]={1,30,25,60,75,41};
    int b[]={0,0,0,0,0,0};
    for (auto const &i : s){
        for (int j=0;j<6;j++)if (i.first<=a[j] && i.second>=a[j])cnt++;
        b[count]=cnt;
        count++;
        cnt=0;
    }
    count=0;
    for (auto const &i : s){
        cout<<"Number of peoples in group "<<i.first<<"-"<<i.second<<" is "<<b[count++]<<endl;
    }
}