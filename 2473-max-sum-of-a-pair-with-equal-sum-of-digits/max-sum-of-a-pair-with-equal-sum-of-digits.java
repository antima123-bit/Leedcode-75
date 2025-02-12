class Solution {
    private static int getDigitSum(int num){
        int sum = 0 ; 
        while(num > 0){
            sum+= num%10 ;
            num/= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> digitSumMap = new HashMap<>();
        int maxSum = -1;
        for(int num : nums){
            int digitSum = getDigitSum(num);
            if(digitSumMap.containsKey(digitSum)){
                maxSum = Math.max(maxSum , num + digitSumMap.get(digitSum));
                digitSumMap.put(digitSum , Math.max(digitSumMap.get(digitSum), num));
            }else{
                digitSumMap.put(digitSum , num);
            }
        }
        return maxSum;
    }
}