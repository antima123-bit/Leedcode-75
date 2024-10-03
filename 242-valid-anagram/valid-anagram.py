class Solution:
  def isAnagram(self, s, t):
    if len(s) != len(t):
      return False

    count = collections.Counter(s)
    count.subtract(collections.Counter(t))
    return all(freq == 0 for freq in count.values()) 