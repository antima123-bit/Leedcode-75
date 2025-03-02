class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 ;
        int j = 0 ;
        while(i< nums1.length && j< nums2.length ){
            if(nums1[i] ==nums2[j]){
         result.add(nums1[i]);
          i++ ;
          j++ ;
            }else if(nums1[i] < nums2[j]){
                i++ ;
            }else{
                j++ ;
            }
        }
       int[] resultArray = new int[result.size()];  
        int index = 0;
        for (int num : result) { 
            resultArray[index++] = num;
        }
        return resultArray; 
    }
}