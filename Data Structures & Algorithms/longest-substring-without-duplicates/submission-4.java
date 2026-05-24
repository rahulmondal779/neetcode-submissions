class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character, Integer> hashCharacter = new HashMap<>();
        int left = 0, right = 0, maxlength = 0, n = s.length();

        while (right<n) {
            Character ch = s.charAt(right);
            
            if (hashCharacter.containsKey(ch) && hashCharacter.get(ch) >= left) {
                left = hashCharacter.get(ch) + 1;
            }
            
            maxlength = Math.max(maxlength, right-left+1);
            hashCharacter.put(ch, right);
            right++;
        }

        return maxlength;
    }
}
