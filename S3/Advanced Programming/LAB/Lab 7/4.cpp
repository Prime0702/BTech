#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    template <typename T>
    vector<size_t> sort_indexes(const vector<T> &v) {
      vector<size_t> x(v.size());
      iota(x.begin(), x.end(), 0);
      sort(x.begin(), x.end(),
           [&v](size_t i1, size_t i2) {return v[i1] < v[i2];});
      return x;
    }
    vector<vector<int>> kClosest(vector<vector<int>>& points, int K) {
        vector<float> dist;
        vector<vector<int>> ans;
        for(vector<vector<int>>::iterator it=points.begin(); it<points.end(); it++) {
            vector<int> point = *it;
            dist.push_back(sqrt(pow(point[0], 2) + pow(point[1],2)));
        }
        vector<long unsigned int> sorted_indices = sort_indexes(dist);
        for(int i = 0; i < K; i++){
            int idx = sorted_indices[i];
            ans.push_back(points[idx]);
        }
        return ans;
    }
};