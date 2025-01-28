class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int currdiff = 0 ;
        int ans = Integer.MAX_VALUE; 
        int diff = Math.abs(ans - target);
        Arrays.sort(nums); 
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1; 
            int k = n - 1; 

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return sum; 
                } else if (sum < target) {
                    j++; 
                } else {
                    k--;
                }

                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
