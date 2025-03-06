class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            
            for (String word : words) {
                int count = 0;
                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
                if (minCount == 0) {
                    break;
                }
            }
            
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(c));
            }
        }
        
        return result;
    }
}
