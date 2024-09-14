class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) return 0;
        int k = 0;
        for(int i =0 ; i< nums.length ; i++){
            if(k < 2 || nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++ ;

            }
        }
        return k ;
    }
}