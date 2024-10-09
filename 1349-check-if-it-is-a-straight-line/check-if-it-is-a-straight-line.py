class Solution(object):
    def checkStraightLine(self, coordinates):
        """
        :type coordinates: List[List[int]]
        :rtype: bool
        """
        x0, y0= coordinates[0] 
        x1,y1= coordinates[1]
        dx= x1 - x0
        dy= y1- y0

        return all((x-x0)*dy == (y- y0 )* dx for x, y in coordinates)