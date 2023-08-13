/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int n = lists.size();
        if (!n) return nullptr;
        int itvl = 1;
        while (itvl < n){
            for (int i = 0; i+itvl < n; i+=itvl*2){
                lists[i] = mtl(lists[i],lists[i+itvl]);
            }
            itvl*=2;
        }
        return lists[0];
    };
    ListNode* mtl(ListNode* a, ListNode* b){
        if (a==nullptr) return b;
        if (b==nullptr) return a;
        if (a->val <= b->val){
            a->next = mtl(a->next,b);
            return a;
        }else{
            b->next=mtl(b->next,a);
            return b;
        }
    };
};