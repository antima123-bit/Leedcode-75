class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), i, 0, 0)) {
                sum += square;
            }
        }
        return sum;
    }

    private boolean canPartition(String s, int target, int index, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }
        
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (canPartition(s, target, i + 1, currentSum + num)) {
                return true;
            }
        }
        return false;
    }
}
