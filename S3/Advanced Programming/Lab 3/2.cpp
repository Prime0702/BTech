#include <iostream>
#include <tuple>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    vector<int> Marks={20,25,25,50,40,22,25,45,42,44,33,35,44,48};
    vector<int>::iterator i;
    string rt;
    //a
    for (i=Marks.begin();i!=Marks.end();i++){
        if (*i%2==0) {
            rt="all are NOT ODD";
            break;
        }else rt="all are ODD";
    }
    cout<<rt<<endl;
    //c
    for (i=Marks.begin();i!=Marks.end();i++){
        if (*i<20) {
            rt="all are NOT ABOVE 20";
            break;
        }
        else rt="all are ABOVE 20";
    }
    cout<<rt<<endl;
    //d
    for (i=Marks.begin();i!=Marks.end();i++){
        if (*i==50) {
            rt="YES 50";
            break;
        }
        else rt="NO 50";
    }
    cout<<rt<<endl;
    //e
    for (i=Marks.begin();i!=Marks.end();i++){
        if (*i<0) {
            rt="YES NEGATIVE";
            break;
        }
        else rt="NO NEGATIVE";
    }
    cout<<rt<<endl;
    //f
    cout<<"Marks with 5 added: ";
    for (int mark : Marks) {
        cout << mark+5 << " ";
    }
    cout<<endl;
    //g
    cout<<"indices where mark is 44: ";
    for (int i=0;i<Marks.size();i++){
        if (Marks[i]==44) cout<<i<<" ";
    }
    cout<<endl;
    //h
    cout<<"average of mark: ";
    int sum=0;
    for (i=Marks.begin();i!=Marks.end();i++){
        sum+=*i;
    }
    cout<<sum/Marks.size()<<endl;
    //i
    sort(Marks.begin(),Marks.end());
    cout<<"sorted marks: ";
    for (i=Marks.begin();i!=Marks.end();i++){
        cout<<*i<<" ";
    }
    cout<<endl;
    // j
    cout << "Adjacent differences between marks: ";
    for (size_t i = 1; i < Marks.size(); ++i) {
        cout << Marks[i] - Marks[i - 1] << " ";
    }
    cout << endl;
    
    // k
    vector<int> anotherClassMarks = {44, 43, 25, 39, 33, 38, 30, 44, 35, 22, 38, 49, 33, 41};
    
    // l
    Marks.insert(Marks.end(), anotherClassMarks.begin(), anotherClassMarks.end());
    cout << "Combined marks of both classes: ";
    for (int mark : Marks) {
        cout << mark << " ";
    }
    cout << endl;
    return 0;
}