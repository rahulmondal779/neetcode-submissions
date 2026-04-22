class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            maxWater = Math.max(width * height, maxWater);

            if(heights[right] > heights[left]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
