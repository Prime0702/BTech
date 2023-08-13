#include <bits/stdc++.h>
using namespace std;
class Solution {
private:
    unordered_map<int, vector<int>> m;
    vector<int> c2(int N) {
        if (m.count(N)) return m[N];
        vector<int> ans(N);
        if (N == 1) ans[0] = 1;
        else {
            int t = 0;
            for (int x : c2((N + 1) / 2)) ans[t++] = 2 * x - 1;
            for (int x : c2(N / 2)) ans[t++] = 2 * x;
        }
        return m[N] = ans;
    }
public:
    vector<int> beautifulArray(int N) {
        return c2(N);
    }
};