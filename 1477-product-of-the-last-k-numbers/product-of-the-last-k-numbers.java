class ProductOfNumbers {
    ArrayList<Integer> nums;

    public ProductOfNumbers() {
        nums = new ArrayList<>();
    }

    public void add(int num) {
        if (num == 0) {
            nums.clear();
        } else {
            if (nums.isEmpty()) {
                nums.add(num);
            } else {
                nums.add(num * nums.get(nums.size() - 1));
            }
        }
    }

    public int getProduct(int k) {
        if (k > nums.size()) {
            return 0;  
        }
        if (k == nums.size()) {
            return nums.get(nums.size() - 1); 
        }
        return nums.get(nums.size() - 1) / nums.get(nums.size() - k - 1); 
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
