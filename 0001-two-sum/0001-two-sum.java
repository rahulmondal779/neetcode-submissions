class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indeces = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indeces.containsKey(diff)) {
                return new int[] {i, indeces.get(diff)};
            }
            indeces.put(nums[i], i);
        }

        return new int[0];
    }
}