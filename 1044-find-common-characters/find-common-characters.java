class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> FreqMap = new HashMap<>();
        for(char c : words[0].toCharArray()){
            FreqMap.put(c,FreqMap.getOrDefault(c, 0)+1);
        }
        for(int i = 1 ; i< words.length ; i++){
            HashMap<Character, Integer> wordMap = new HashMap<>();
            for(char c: words[i].toCharArray()){
                wordMap.put(c, wordMap.getOrDefault(c, 0)+1);
            }
            for(char c: FreqMap.keySet().toArray(new Character[0])){
                if(wordMap.containsKey(c)){
                    FreqMap.put(c, Math.min(FreqMap.get(c) , wordMap.get(c)));
                }else{
                   FreqMap.remove(c);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for(char c: FreqMap.keySet()){
            int count = FreqMap.get(c);
            for(int j =  0; j< count ; j++){
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}