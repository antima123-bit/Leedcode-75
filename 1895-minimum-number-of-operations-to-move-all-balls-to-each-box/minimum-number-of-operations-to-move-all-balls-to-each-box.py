class Solution(object):
    def minOperations(self, boxes):
        """
        :type boxes: str
        :rtype: List[int]
        """
        n= len(boxes)
        ans=[0] * n
        count=0
        moves=0
        for i in range(n):
            ans[i] += moves
            count+=int(boxes[i])
            moves+=count

        count = 0
        moves = 0
        for i in range(n-1 , -1 ,-1):
            ans[i] += moves
            count+=int(boxes[i])
            moves+=count
        return ans

