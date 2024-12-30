# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        ans = []
        q= deque()
        q.append(root)
        while q:
            ln = len(q)
            mx = -sys.maxsize
            for _ in range(ln):
                node= q.popleft()
                mx = max(mx,node.val)
                if node.left:
                   q.append(node.left)
                if node.right:
                   q.append(node.right)
            ans.append(mx)
        return ans