class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer , Integer> countMap = new HashMap<>();
        for(int answer: answers){
            countMap.put(answer, countMap.getOrDefault(answer,0)+1);
        }
        int totalRabbit = 0 ;
        for(int x: countMap.keySet()){
            int count = countMap.get(x);
            int groupSize = x + 1;
            int group = 0;
            while(count > 0){
              count -= groupSize;
              group++;
            }
            totalRabbit += groupSize * group;
        }
        return totalRabbit;
    }
}