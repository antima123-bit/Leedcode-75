class Solution{
    public:
    void sortColors(std::vector<int>& nums) {
    int start = 0; 
    int mid = 0;
    int end = nums.size()-1;
    while(mid <= end){
        switch(nums[mid]){
            case 0:
                swap(nums, start, mid);
                start++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(nums, mid, end);
                end--;
                break;
        }
    }
}
private:
 void swap(std::vector<int>& arr, int pos1, int pos2){
    int temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
}
};