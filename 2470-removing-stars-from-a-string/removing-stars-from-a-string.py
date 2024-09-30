class Solution:
  def removeStars(self, s):
    ans = []
    for c in s:
      if c == '*':
        ans.pop()
      else:
        ans.append(c)
    return ''.join(ans)