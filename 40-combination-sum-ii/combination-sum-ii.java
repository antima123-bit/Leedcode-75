import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates and facilitate the backtracking
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        // If target is 0, we've found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));  // Add a copy of current to the result
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If the current candidate is greater than the target, break (no need to continue)
            if (candidates[i] > target) break;

            // Include the current candidate in the combination
            current.add(candidates[i]);

            // Recurse with updated target and next index (i + 1 because each element can be used only once)
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Backtrack by removing the last element added
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = sol.combinationSum2(candidates, target);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
