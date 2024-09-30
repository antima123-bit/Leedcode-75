class Solution:
  def findDifference(self, nums1,
                     nums2):
    set1 = set(nums1)
    set2 = set(nums2)
    return [set1 - set2, set2 - set1]