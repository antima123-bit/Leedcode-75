class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0 ; i< nums1.length ; i++){
            for(int j = 0 ; j< nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    result.add(nums1[i]);
                }
            }
        }
       int[] intersectionArray = new int[result.size()];
       int index = 0 ;
       for(Integer num: result){
        intersectionArray[index++] = num;

       }
       return intersectionArray;
    }
}