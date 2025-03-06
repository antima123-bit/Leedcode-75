class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr1){
            freqMap.put(num , freqMap.getOrDefault(num , 0 )+1);
        }
        int index = 0 ;
        for(int num: arr2){
            while(freqMap.get(num)>0){
                arr1[index++] = num;
                freqMap.put(num , freqMap.get(num) -1);
            }
        }
        List<Integer>remaining = new ArrayList<>();
        for(int num : freqMap.keySet()){
            while(freqMap.get(num)>0){
                remaining.add(num);
                freqMap.put(num, freqMap.get(num ) -1);
            }
        }
        Collections.sort(remaining);
        for(int num: remaining){
            arr1[index++] =num;
        }
        return arr1;
    }
}