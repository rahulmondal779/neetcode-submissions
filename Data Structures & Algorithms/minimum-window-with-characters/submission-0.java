class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j+1);
                if (containsAll(subString, t)) {
                    if (subString.length() < minLen) {
                        minLen = subString.length();
                        ans = subString;
                    }
                }
            }
        }
        return ans;
    }

    private boolean containsAll(String sub, String t) {
        int[] freq = new int[128];

        for (char c : sub.toCharArray()) {
           freq[c]++;
        }

        for (char c : t.toCharArray()) {
            if (freq[c] == 0) {
                return false;
            }
            freq[c]--;
        }

        return true;
    }
}
