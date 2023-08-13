#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(int argc, char const *argv[])
{
    vector<int> v;
    int x = 0;
    while (x!=6){
        cout<<"1. Adds an element x to the vector A at the end."<<endl;
        cout<<"2. Sorts the vector A in ascending order."<<endl;
        cout<<"3. Reverses the vector A."<<endl;
        cout<<"4. Prints the size of the vector A."<<endl;
        cout<<"5. prints space-separated values of the vector A."<<endl;
        cout<<"6. Exits."<<endl;
        cout<<"Enter your choice: ";
        cin>>x;
        switch (x){
            case 1:
                int y;
                cout<<"Enter the element to be added: ";
                cin>>y;
                v.push_back(y);
                break;
            case 2:
                sort(v.begin(),v.end());
                break;
            case 3:
                reverse(v.begin(),v.end());
                break;
            case 4:
                cout<<"Size of the vector is: "<<v.size()<<endl;
                break;
            case 5:
                for (int i = 0; i < v.size(); i++)
                {
                    cout<<v[i]<<" ";
                }
                cout<<endl;
                break;
            case 6:
                break;
            default:
                cout<<"Invalid choice!"<<endl;
                break;
        }
    }
    return 0;
}