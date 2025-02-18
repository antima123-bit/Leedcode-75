class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int left = 0;
        int right = 0;
        for(int k = 0;k<nums.length;k++){
            if(nums[k] == 1){
                right+= nums[k];
            }
        }
        int i = 1;
        int j = 0;
        int maxsum = right;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        while(i<=nums.length){
            if(nums[j]==0){
                left++;
            }
            else{
                right--;
            }
            int sum = left + right;
            if(sum>maxsum){
                al.clear();
                al.add(i);
                maxsum = sum;
            }
            else if(sum == maxsum){
                al.add(i);
            }
            i++;
            j++;
        }
        return al;

    }
}