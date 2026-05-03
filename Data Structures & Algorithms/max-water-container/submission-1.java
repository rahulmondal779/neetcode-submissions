class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;

        while (left<right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int areaWater = height * width;
            maxWater = Math.max(maxWater, areaWater);
            if (heights[left]<heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
