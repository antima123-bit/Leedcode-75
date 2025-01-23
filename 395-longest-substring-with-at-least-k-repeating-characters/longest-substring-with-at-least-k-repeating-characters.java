class Solution {
    public int longestSubstring(String s, int k) {
        //this is our edge case 
      if(s == null || s.length() == 0|| k >s.length ()){
        return 0 ;
      }   
      //now we intialize the storing the characters
      int[] freq = new int[26];
      for(char c : s.toCharArray()){
        freq[c - 'a']++ ;
      }
      //now check if the string is valid or not 
      //if it is valid then frequency > k 
      //if frequency < k this follow the invalid condition
      for(int i = 0 ; i< s.length() ; i++){
        if(freq[s.charAt(i) -'a'] < k){
            int left = longestSubstring(s.substring(0,i),k);
            int right = longestSubstring(s.substring(i+1),k);
return Math.max(left,right);
        }
      }
      


return s.length();
    }
}
