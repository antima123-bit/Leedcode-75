class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //here we store the current sum of the element
        int currentsum = 0;
        int minlength = Integer.MAX_VALUE;
        int start = 0 ;  
        for(int end = 0 ;end < nums.length ; end++){
            currentsum += nums[end];
            while(currentsum >= target){
                minlength = Math.min(minlength , end-start +1);
                currentsum -= nums[start];
                start++ ;
            }
        }
                            return minlength == Integer.MAX_VALUE ? 0 : minlength;

    }
}
    









