class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1, b = -1, c = -1;
        
        char[] arr = s.toCharArray();
        
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int min = -1;
            
            if (arr[i] == 'a') {
                min = Math.min(b, c); 
                a = i; 
            } else if (arr[i] == 'b') {
                min = Math.min(a, c); 
                b = i;
            } else {
                min = Math.min(a, b); 
                c = i;
            }
                        count = (min == -1) ? count : count + min + 1;
        }
        
        return count;
    }
}