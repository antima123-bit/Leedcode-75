class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] extendedColors = new int[n + k - 1];
        System.arraycopy(colors, 0, extendedColors, 0, n);
        System.arraycopy(colors, 0, extendedColors, n, k - 1);
        int res = 0;
        int cnt = 1;
        for (int i = 1; i < extendedColors.length; ++i) {
            if (extendedColors[i] != extendedColors[i - 1]) ++cnt;
            else cnt = 1;
            if (cnt >= k) ++res;
        }     
        return res;
    }
}