class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> freq = new HashMap<>();
        long good = 0 ;
        for(int i = 0; i< n ;i++){
           int key = nums[i] - i;
            good += freq.getOrDefault(key , 0);
            freq.put(key , freq.getOrDefault(key , 0)+1 );
        }
        return (long) n * (n-1) / 2 - good ;
    }
}