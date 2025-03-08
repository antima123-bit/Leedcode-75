class Solution {
    public int minSubarray(int[] nums, int p) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
            totalSum %= p; // To prevent integer overflow
        }

        int rem = totalSum % p;
        if (rem == 0) return 0; // Already divisible

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with (0, -1)

        int prefixSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            if (prefixSum < 0) prefixSum += p; // Ensuring non-negative mod values

            int target = (prefixSum - rem + p) % p;

            if (map.containsKey(target)) {
                minLength = Math.min(minLength, i - map.get(target));
            }

            map.put(prefixSum, i);
        }

        return (minLength == nums.length) ? -1 : minLength;
    }
}
