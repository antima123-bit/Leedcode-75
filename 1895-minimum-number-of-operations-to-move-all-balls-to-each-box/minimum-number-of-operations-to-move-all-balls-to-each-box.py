class Solution:
    def minOperations(self, boxes):
        n = len(boxes)
        ans = [0] * n

        # Calculate the operations needed to move balls to each box from left to right
        count = 0
        moves = 0
        for i in range(n):
            ans[i] += moves
            count += int(boxes[i])
            moves += count

        # Calculate the operations needed to move balls to each box from right to left
        count = 0
        moves = 0
        for i in range(n-1, -1, -1):
            ans[i] += moves
            count += int(boxes[i])
            moves += count

        return ans
