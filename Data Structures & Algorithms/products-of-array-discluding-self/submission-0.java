class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] maxProducts = new int[n];
       
        maxProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            maxProducts[i] = maxProducts[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            maxProducts[i] = maxProducts[i] * right;
            right = right * nums[i];
        }
        System.gc();
        return maxProducts;
    }
}  
