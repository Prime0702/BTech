#include <iostream>
#include <vector>
#include <queue>
using namespace std;
void pmv(vector<int> Vec)
{
	for (int i = 0; i < Vec.size(); i++) {
		cout << Vec[i] << " ";
	}
	cout << endl;
	return;
}
int main()
{
    
    priority_queue<vector<int> > pq;
	vector<int> data_1{ 10, 20, 30, 40 };
	vector<int> data_2{ 10, 20, 35, 40 };
	vector<int> data_3{ 30, 25, 10, 50 };
	vector<int> data_4{ 20, 10, 30, 40 };
	vector<int> data_5{ 5, 10, 30, 40 };
	pq.push(data_1);
	pq.push(data_2);
	pmv(pq.top());
	pq.push(data_3);
	pmv(pq.top());
	pq.push(data_4);
	pq.push(data_5);
	pmv(pq.top());
    vector<int> tm;
    do{
        tm=pq.top();
        pq.pop();
    }while(!pq.empty());
    cout << "min: ";
    pmv(tm); 
	return 0;
}
