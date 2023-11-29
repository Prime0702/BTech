#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    map<string, vector<int>> x;
    vector<int> diffWaysToCompute(string y) {
        int N = y.size(); vector<int> result;
        for(int i = 0; i < N; i++){
            char c = y[i];
            if(c == '+' || c == '-' || c == '*'){
                string sub1 = y.substr(0, i);string sub2 = y.substr(i+1);
                vector<int> v1 = x.find(sub1) == x.end() ? diffWaysToCompute(sub1) : x[sub1];
                vector<int> v2 = x.find(sub2) == x.end() ? diffWaysToCompute(sub2) : x[sub2];
                for(int i1 : v1)for(int i2 : v2){
                        int r;
                        switch(c){
                            case '+':
                                r = i1+i2;
                                break;
                            case '-':
                                r = i1-i2;
                                break;
                            case '*':
                                r = i1*i2;
                                break;
                        }
                        result.push_back(r);
                }
            }
        }
        if(result.size() == 0)result.push_back(stoi(y));
        x[y] = result;
        return result;
    }
};