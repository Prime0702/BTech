#include <iostream>
#include <map>
#include <string>
using namespace std;
int main(){
    map<string,int> m1;
    map<int,string> m2;
    map<string,int>::iterator i;
    map<int,string>::iterator j;
    string x;
    m1.emplace("December",31);
    m1.emplace("November",30);
    m1.emplace("October",31);
    m1.emplace("September",30);
    m1.emplace("August",31);
    m1.emplace("July",31);
    m1.emplace("June",30);
    m1.emplace("May",31);
    m1.emplace("April",30);
    m1.emplace("March",31);
    m1.emplace("February",28);
    m1.emplace("January",31);
    cout<<"Input: ";cin>>x;
    m2.emplace(12,"December");
    m2.emplace(11,"November");
    m2.emplace(10,"October");
    m2.emplace(9,"September");
    m2.emplace(8,"August");
    m2.emplace(7,"July");
    m2.emplace(6,"June");
    m2.emplace(5,"May");
    m2.emplace(4,"April");
    m2.emplace(3,"March");
    m2.emplace(2,"February");
    m2.emplace(1,"January");
    string prev,aft;
    for(j=m2.begin();j!=m2.end();j++){
        if (x=="January"){
            prev="December";
            aft="February";
        }
        else if (x=="December"){
            prev="November";
            aft="January";
        }
        else if ((*j).second==x){
            if(--j!=m2.end())prev=(*j).second;
            if(++++j!=m2.end())aft=(*j).second;
        }
    }
    for(i=m1.begin();i!=m1.end();i++)if((*i).first==x){
        cout<<(*i).second<<" days"<<endl;
        i=m1.find(aft);
        cout<<(*i).first<<endl;
        cout<<(*i).second<<" days"<<endl;
        i=m1.find(prev);
        cout<<(*i).first<<endl;
        cout<<(*i).second<<" days"<<endl;
        break;
    }
    return 0;
}