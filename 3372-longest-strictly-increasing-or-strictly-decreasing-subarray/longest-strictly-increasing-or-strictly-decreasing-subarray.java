class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int longestSubarray = 1 ;
        int increasing = 1;
        int decreasing = 1;
        for(int i = 1 ; i< n ; i++){
            if(nums[i] > nums[i-1]){
                increasing++ ;
                decreasing=1;
            }else if(nums[i] <nums[i-1]){
                decreasing ++;
                increasing =1;
            }else{
                increasing = 1; 
                decreasing =1 ;
            }
            longestSubarray= Math.max(longestSubarray, Math.max(increasing, decreasing));
        }
        return longestSubarray;
    }
}


