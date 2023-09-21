#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        int cur=0;
        vector<string> ans;
        for (int& v : target){
            while (++cur<v){
                ans.push_back("Push");
                ans.push_back("Pop");
            }
            ans.push_back("Push");
        }
        return ans;
    }
};