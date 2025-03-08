class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - k; i++) {
            int whiteCount = 0;
            
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    whiteCount++;
                }
            }
            
            minOperations = Math.min(minOperations, whiteCount);
        }
        return minOperations;   
    }
}