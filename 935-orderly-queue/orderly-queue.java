class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String smallest = s;
            int n = s.length();
            for (int i = 1; i < n; i++) {
                // Generate rotated string
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(smallest) < 0) {
                    smallest = rotated;
                }
            }
            return smallest;
        } else {
            // If k > 1, we can fully sort the string
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}
