class Solution {
    public int findTheLongestSubstring(String s) {
        int n = s.length();
        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -1);
        int mask = 0 , maxLen = 0;
        pos[0] = 0;
        for(int i = 0 ; i<n ;i++){
            char c = s.charAt(i);
            if(c == 'a') mask ^= (1 << 0);
            if(c == 'e') mask ^= (1<<1);
            if(c == 'i') mask ^= (1<<2);
            if(c == 'o') mask ^= (1<<3);
            if(c =='u') mask^=(1<<4);
            if(pos[mask] >= 0 ){
                maxLen = Math.max(maxLen, i+1-pos[mask]);
            }
            else{
                pos[mask] = i+1 ;

            }
        }
        return maxLen;
    }
}