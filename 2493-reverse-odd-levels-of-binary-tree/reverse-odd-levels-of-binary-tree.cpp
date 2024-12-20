/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* reverseOddLevels(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        q.push(NULL);
        bool odd = true;
        stack<int> st;
        while (!q.empty()) {
            TreeNode* temp = q.front();
            q.pop();
            if (temp == NULL) {
                odd ? odd = false : odd = true;
                if (!q.empty()) {
                    q.push(NULL);
                }
            } else {
                if (!odd) {
                    temp->val = st.top();
                    st.pop();
                }
                if (temp->left != NULL) {
                    q.push(temp->left);
                    if (odd) {
                        st.push(temp->left->val);
                    }
                }
                if (temp->right != NULL) {
                    q.push(temp->right);
                    if (odd) {
                        st.push(temp->right->val);
                    }
                }
            }
        }
        return root;
    }
};