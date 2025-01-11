class Solution {
    public long maxRunTime(int n, int[] batteries) {
        // Step 1: Calculate total energy available
        long totalEnergy = 0;
        for (int battery : batteries) {
            totalEnergy += battery;
        }

        // Step 2: Define binary search range
        long low = 0, high = totalEnergy / n;

        // Step 3: Perform binary search
        while (low < high) {
            long mid = (low + high + 1) / 2; // Calculate mid

            // Step 4: Check if this `mid` time is possible
            long requiredEnergy = n * mid;  // Energy needed for `mid` minutes
            long availableEnergy = 0;

            for (int battery : batteries) {
                availableEnergy += Math.min(battery, mid); // Add min(battery, mid)
            }

            if (availableEnergy >= requiredEnergy) {
                // If we can run for `mid` minutes, try for a larger time
                low = mid;
            } else {
                // Otherwise, try for a smaller time
                high = mid - 1;
            }
        }

        return low; // Return the maximum time possible
    }
}
