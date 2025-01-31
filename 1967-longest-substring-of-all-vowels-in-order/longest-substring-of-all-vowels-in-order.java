class Solution {
    public int longestBeautifulSubstring(String word) {
        int count = 1;
        int l = 1;
        int max_len = 0;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                l++;
            } else if (word.charAt(i - 1) < word.charAt(i)) {
                count++;
                l++;
            } else {
                l = 1;
                count = 1;
            }
            if (count == 5) {
                max_len = Math.max(max_len, l);
            }
        }

        return max_len;
    }
}