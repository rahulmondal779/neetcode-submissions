class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int[] prefixGcd = new int[n];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = greatestCommonDivisor(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        
        long sum = 0;
        for (int i = 0; i < prefixGcd.length/2; i++) {
            sum = sum + (long) greatestCommonDivisor(prefixGcd[i], prefixGcd[prefixGcd.length-i-1]);
        }

        return sum;
    }

    public int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}