class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> countOfChar = new HashMap();
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;

        while(right<n) {
            char ch = s.charAt(right);
            if(countOfChar.containsKey(ch) && countOfChar.get(ch) >= left) {
                left = countOfChar.get(ch) + 1;
            }
            maxLength = Math.max(maxLength, right-left+1);
            countOfChar.put(ch, right);
            right++;
        }

        return maxLength;
    }
}
