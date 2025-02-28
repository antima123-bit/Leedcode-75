class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)set.add(num);
        int n = arr.length;
        int maxLen = 0 ;
        for(int i = 0 ; i< n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int a = arr[i] ;
                int b = arr[j];
                int length = 2;
                while(set.contains(a+b)){
                    int temp = a+b ;
                    a = b ;
                    b = temp ;
                    length++ ;
                }
                maxLen = Math.max(maxLen , length);
            }
        }
        return maxLen >= 3 ? maxLen:0 ;
    }
}