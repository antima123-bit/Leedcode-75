class Solution:
  def isHappy(self, n):
    def squaredSum(n):
      summ = 0
      while n > 0:
        summ += pow(n % 10, 2)
        n //= 10
      return summ

    slow = squaredSum(n)
    fast = squaredSum(squaredSum(n))

    while slow != fast:
      slow = squaredSum(slow)
      fast = squaredSum(squaredSum(fast))

    return slow == 1