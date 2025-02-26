class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
      int n = nums.length;
      int[] freq = new int [n+1];
      int MOD = 1_000_000_007 ;
      for(int[] req : requests){
        freq[req[0]] += 1;
        freq[req[1] +1] -=1;

      } 
      for(int i = 1 ; i< n ; i++){
        freq[i] += freq[i-1];
      } 
      freq = Arrays.copyOf(freq , n);
      Arrays.sort(freq);
      Arrays.sort(nums);
      long maxSum = 0 ;
       for(int i = n-1 ; i>= 0 ; i--){
        maxSum = (maxSum + (long) nums[i] * freq[i] )% MOD ;
       }
       return(int) maxSum;
    }
}