public class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return ""; 
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int left = 0; 
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length(); 

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charCount.containsKey(currentChar)) {
                if (charCount.get(currentChar) > 0) {
                    requiredChars--; 
                }
                charCount.put(currentChar, charCount.get(currentChar) - 1);
            }

            while (requiredChars == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                if (charCount.containsKey(leftChar)) {
                    charCount.put(leftChar, charCount.get(leftChar) + 1);
                    if (charCount.get(leftChar) > 0) {
                        requiredChars++; 
                    }
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
