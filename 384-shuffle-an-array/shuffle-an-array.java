import java.util.Random;

class Solution {
    private int[] original; 
    private int[] current;  
    private Random rand;   

    public Solution(int[] nums) {
        original = nums.clone();
        current = nums.clone(); 
        rand = new Random();   
    }

    public int[] reset() {
        current = original.clone(); 
        return current;
    }

    public int[] shuffle() {
        for (int i = 0; i < current.length; i++) {
            int j = i + rand.nextInt(current.length - i);
            
            int temp = current[i];
            current[i] = current[j];
            current[j] = temp;
        }
        return current;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */