class MyCircularDeque:

    def __init__(self, k):
        """Initialize your data structure here. Set the size of the deque to be k."""
        self.k = k
        self.q = [-1] * k  # Circular deque represented as a list
        self.size = 0      # Current number of elements in deque
        self.front = 0     # Index of the front element
        self.rear = k - 1  # Index of the rear element

    def insertFront(self, value):
        """Adds an item at the front of Deque. Return true if the operation is successful."""
        if self.isFull():
            return False

        self.front = (self.front - 1 + self.k) % self.k  # Circular update for front
        self.q[self.front] = value
        self.size += 1
        return True

    def insertLast(self, value):
        """Adds an item at the rear of Deque. Return true if the operation is successful."""
        if self.isFull():
            return False

        self.rear = (self.rear + 1) % self.k  # Circular update for rear
        self.q[self.rear] = value
        self.size += 1
        return True

    def deleteFront(self):
        """Deletes an item from the front of Deque. Return true if the operation is successful."""
        if self.isEmpty():
            return False

        self.front = (self.front + 1) % self.k  # Circular update for front
        self.size -= 1
        return True

    def deleteLast(self):
        """Deletes an item from the rear of Deque. Return true if the operation is successful."""
        if self.isEmpty():
            return False

        self.rear = (self.rear - 1 + self.k) % self.k  # Circular update for rear
        self.size -= 1
        return True

    def getFront(self):
        """Get the front item from the deque."""
        return -1 if self.isEmpty() else self.q[self.front]

    def getRear(self):
        """Get the last item from the deque."""
        return -1 if self.isEmpty() else self.q[self.rear]

    def isEmpty(self):
        """Checks whether the circular deque is empty or not."""
        return self.size == 0

    def isFull(self):
        """Checks whether the circular deque is full or not."""
        return self.size == self.k
