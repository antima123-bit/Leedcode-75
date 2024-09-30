class CustomStack:

    def __init__(self, maxSize):
        self.stack = []  # Stack to store elements
        self.increment_arr = [0] * maxSize  # Auxiliary array for lazy increments
        self.maxSize = maxSize  # Maximum size of the stack

    def push(self, x):
        if len(self.stack) < self.maxSize:
            self.stack.append(x)  # Add the element to the stack

    def pop(self):
        if not self.stack:
            return -1  # Return -1 if stack is empty

        index = len(self.stack) - 1  # Get the index of the top element
        if index > 0:
            self.increment_arr[index - 1] += self.increment_arr[index]  # Transfer the increment to the next element

        popped_value = self.stack.pop() + self.increment_arr[index]  # Apply the increment to the popped value
        self.increment_arr[index] = 0  # Reset the increment for this element
        return popped_value  # Return the popped value with increment

    def increment(self, k, val):
        limit = min(k, len(self.stack)) - 1  # Find the number of elements to increment
        if limit >= 0:
            self.increment_arr[limit] += val  # Lazily increment up to the limit
