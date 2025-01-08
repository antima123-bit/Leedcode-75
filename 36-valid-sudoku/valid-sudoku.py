class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        #intialize the rows, cols, and the boxes having 3*3 matrix
        rows=[set() for _ in range(9)]
        cols=[set() for _ in range(9)]
        boxes=[set() for _ in range(9)]

        #now generate the borad of the elemnt to present 
        for i in range(9):
            for j in range(9):
                num= board[i][j]
                #if the "." sign present into any of the block then this will be refere to as the vacant block and continue with the next step to move
                if num == '.':
                    continue

        #now checks row if the elemnt is repeated or not if yes then we return false
                if num in rows[i]:
                   return False
                rows[i].add(num)

                if num in cols[j]:
                    return False
                cols[j].add(num)

                box_index=(i//3 )* 3 + (j//3)
                if num in boxes[box_index]:
                    return False
                boxes[box_index].add(num)
        return True

        

