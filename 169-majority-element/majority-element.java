class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            countMap.put(num , countMap.getOrDefault(num ,0) + 1);
        }
        for(Map.Entry<Integer , Integer>entry : countMap.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return - 1;

    }
}