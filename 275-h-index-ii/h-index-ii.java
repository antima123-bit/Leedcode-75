class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;

        int low = 0, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            
            if (mid == 0) {
                if (citations[n - 1] >= 1) return 1;
                return 0; 
            }
            
            if (citations[n - mid] >= mid) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }

        return high;
    }
}
