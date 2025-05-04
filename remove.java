class remove{
    public static void main(String[] args) {
        int []nums={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        
    }

    public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case
        
        int k = 1; // Pointer for unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Found a new unique element
                nums[k] = nums[i]; // Move it to the front
                k++; // Increment unique count
            }
        }
        
        return k; // k is the number of unique elements
    }
}