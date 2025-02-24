class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int current = nums[0];
        for(int i = 1 ; i< nums.length; i++){
            if(nums[i] <= current){
                current++ ;
                moves+= current - nums[i];
            }else{
                current = nums[i];
            }
        }
        return moves;
    }
}