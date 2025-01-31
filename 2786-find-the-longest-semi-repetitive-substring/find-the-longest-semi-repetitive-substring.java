class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int maxLen = 1;  // Stores the length of the longest semi-repetitive substring
        int count = 0;  // Counts the number of consecutive repeated digits
        int left = 0;  // Points to the left end of the current substring

        for (int right = 0; right < s.length(); right++) {
            // Check if the current digit is the same as the previous one
            if (right > 0 && s.charAt(right - 1) == s.charAt(right)) {
                count++;
            }

            while (count > 1) {
                // Check if the digit at the left pointer is the same as the next one
                if (right > left && s.charAt(left) == s.charAt(left + 1)) {
                    count--;
                }
                left++;
            }

            // Update the maximum length of the semi-repetitive substring
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}