class MyCalendarTwo(object):

    def __init__(self):
        self.booked=[]
        self.overlaps=[]

    def book(self, start, end):
        """
        :type start: int
        :type end: int
        :rtype: bool
        """
        #overlaps start = os , overlaps ends = oe
        for os, oe in self.overlaps:
            if start < oe and end > os:
                return False
#if the overlaps is occur then return false otherwise return true

# Your MyCalendarTwo object will be instantiated and called as such:
# obj = MyCalendarTwo()
# param_1 = obj.book(start,end)
        for bs , be in self.booked:
            if start < be and end > bs:
               self.overlaps.append((max(start,bs),min(end,be)))

        self.booked.append((start,end))
        return True