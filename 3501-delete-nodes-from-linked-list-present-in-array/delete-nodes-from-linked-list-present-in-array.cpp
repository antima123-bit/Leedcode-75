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
  ListNode* modifiedList(vector<int>& nums, ListNode* head) {
    ListNode dummy(0, head);
    unordered_set<int> numsSet{nums.begin(), nums.end()};

    for (ListNode* curr = &dummy; curr->next != nullptr;)
      if (numsSet.contains(curr->next->val))
        curr->next = curr->next->next;
      else
        curr = curr->next;

    return dummy.next;
  }
};