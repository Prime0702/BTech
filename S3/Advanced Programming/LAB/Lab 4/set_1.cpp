#include <iostream>
#include <set>
using namespace std;
int main(){
    set<int> s;
    set<int>::iterator i;
    set<int>::iterator f;
    int j,x,y,z;
    i=s.begin();
    cout<<"Enter the number of iterations: ";cin>>z;
    for (int k=0;k<z;k++){
        cout<<"1. Insert\n2. Search\nChoice: ";cin>>x;
        switch(x){
            case 1:
                cout<<"Enter the number to insert: ";cin>>y;
                s.insert(y);
                break;
            case 2:
                cout<<"Enter the number to search: ";cin>>y;
                f=s.find(y);
                if (f!=s.end())
                    cout<<"Found\n";
                else
                    cout<<"Not found\n";
                break;
            default:
                cout<<"Invalid choice\n";
                break;
        }
    }
    return 0;
}