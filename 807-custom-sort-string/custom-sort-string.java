class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character , Integer> freqCount = new HashMap<>();
        for(char c: s.toCharArray()){
            freqCount.put(c, freqCount.getOrDefault(c, 0)+1);
        }
        List<Character> result = new ArrayList<>();
        for(char c: order.toCharArray()){
            //if the character is present in string then we get the frequncy of the caharcter and if coutn is less then 0 then add to the result otherewise remove from the result 
            if(freqCount.containsKey(c)){
                int count = freqCount.get(c);
                while(count-->0){
                    result.add(c);
                }
                freqCount.remove(c);
            }
        }
        for(char c: freqCount.keySet()){
            int count = freqCount.get(c);
            while(count-->0){
                result.add(c);
            }
        }
        StringBuilder finalresult = new StringBuilder();
        for(char c : result){
            finalresult.append(c);
        }
        return finalresult.toString();
    }

}