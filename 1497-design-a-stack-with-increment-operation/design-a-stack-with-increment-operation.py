class CustomStack:

    def __init__(self, maxSize):
        self.stack = []  
        self.increment_arr = [0] * maxSize  
        self.maxSize = maxSize  

    def push(self, x):
        if len(self.stack) < self.maxSize:
            self.stack.append(x)  

    def pop(self):
        if not self.stack:
            return -1  

        index = len(self.stack) - 1  
        if index > 0:
            self.increment_arr[index - 1] += self.increment_arr[index]  

        popped_value = self.stack.pop() + self.increment_arr[index]  
        self.increment_arr[index] = 0  
        return popped_value  

    def increment(self, k, val):
        limit = min(k, len(self.stack)) - 1  
        if limit >= 0:
            self.increment_arr[limit] += val  
