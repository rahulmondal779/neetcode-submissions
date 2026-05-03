class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int longest = 0, left = 0, maxFreq = 0;
        int[] freq = new int[26];

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            int windowSize = right - left + 1;

            if (windowSize-maxFreq>k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        
        return longest;
    }
}
