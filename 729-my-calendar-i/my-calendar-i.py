



class MyCalendar(object):

    def __init__(self):
       self.calendar = [] 

    def book(self, start, end):
        """
        :type start: int
        :type end: int
        :rtype: bool
        """
        


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)

        for event in self.calendar:  
            existing_start, existing_end = event

            if start < existing_end and  end > existing_start:
               return False

        self.calendar.append((start,end))
        return True

