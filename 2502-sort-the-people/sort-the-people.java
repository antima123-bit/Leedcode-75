class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<String, Integer>> result = new ArrayList();
        for(int i = 0 ; i<names.length ; i++){
        result.add(new Pair<>( names[i] , heights[i]));
        }
        result.sort((a,b) -> b.getValue() - a.getValue());
        String[] sortedNames = new String[names.length];
        for(int i = 0 ; i< names.length ; i++){
           sortedNames[i] = result.get(i).getKey();
    }
     return sortedNames;
    }
   
}
