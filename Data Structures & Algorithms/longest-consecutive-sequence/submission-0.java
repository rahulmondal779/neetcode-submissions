class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> sets = new HashSet<>();
        for (int i : nums) {
            sets.add(i);
        }
        int longestStreak = 0;
        
        for (Integer integer : sets) {
            if (!sets.contains(integer - 1)) {
                int current = integer;
                int streak = 1;

                while (sets.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longestStreak = Math.max(longestStreak, streak);
            }
        }

        return longestStreak;
    }
}
