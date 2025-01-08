class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        '''firstly we have to intialize  the left, right, bottom , top block to tranverse the elements'''
        res=[]
        top = 0
        bottom=len(matrix)
        left=0
        right=len(matrix[0])
        '''now we make a while condition which define that if the left element< right element or top<bottom then we have to tranverse the elment inthe matrix'''
        while left<right and top<bottom:
        #tranverse the top
            for i in range(left ,right):
                res.append(matrix[top][i])
            top+=1
        #tranverse the right'''
            for i in range(top , bottom):
                res.append(matrix[i][right-1])
            right-=1

        #now this condition is used when the left>=right and top>=bottom at this casee the tranverse should be end'''
            if not (left<right and top<bottom):
                break
        #tranverse from the bottom'''
            for i in range(right-1, left-1 ,-1):
                res.append(matrix[bottom-1][i])
            bottom-=1

            for i in range(bottom-1, top-1, -1):
                res.append(matrix[i][left])
            left+=1
        return res
