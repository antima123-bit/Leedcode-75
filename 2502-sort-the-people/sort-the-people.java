class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        //here we do sort in treeMap because in treemap elements are arranged into the ascending order whereas the we use reverseOrder where the list become decensding order 
        TreeMap<Integer , String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i =0 ; i< names.length; i++){
            map.put(heights[i] ,names[i]);
        }
        String[] sortedNames = new String[names.length];
        int index =  0 ;
        for(String name : map.values()){
        sortedNames[index++] = name;
        }
        return sortedNames;
    }
}