class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        matrix=[[0]*n for _ in range(n)]
        #here one thing is different like in spiral matrix we used to iterate the matrix from m*n but here in sprial matrix 2 we iteratte the matrix from n*n
        top = 0
        bottom=n
        left=0
        right=n
        num=1
       #here in the while condition it define the matrix should be run  from n*n time because we filled the element from 1 to n*n
        while num <= n*n:
            for i in range(left, right):
                matrix[top][i]= num
                num+=1
            top+=1
            for i in range(top , bottom):
                matrix[i][right-1] =num
                num+=1
            right-=1

            #here we does not used the if condition where we ensure that elemnet must me tranverse in the sprial matrix matrix but in this case the matrix does tranverse but it olny filled the element from 1 to n* n

            for i in range(right-1, left-1, -1):
                matrix[bottom-1][i]=num
                num+=1
            bottom-=1

            for i in range(bottom-1, top-1 ,-1):
                matrix[i][left]=num
                num+=1
            left+=1
        return matrix