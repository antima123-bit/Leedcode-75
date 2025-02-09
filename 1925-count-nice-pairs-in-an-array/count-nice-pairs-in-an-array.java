class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1_000_000_007;

        int n = nums.length;
        HashMap<Integer , Integer> freq = new HashMap<>();
        long count  = 0 ;
        for(int num : nums){
            int diff = num - reverse(num);
            count = (count+ freq.getOrDefault(diff , 0 ))% MOD;
            freq.put(diff , freq.getOrDefault(diff , 0) + 1);
        }
        return (int) count;
    }
    private int reverse(int num){
        int rev = 0; 
        while(num > 0){
            rev = rev * 10 + num% 10;
            num/=10 ;
                    }
                    return rev;
    }
}