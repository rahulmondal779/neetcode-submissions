class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length()!=word2.length()) {
            return false;
        }

        HashMap<Character, Integer> word1HashMap = new HashMap<>();
        HashMap<Character, Integer> word2HashMap = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            word1HashMap.put(word1.charAt(i), word1HashMap.getOrDefault(word1.charAt(i), 0) + 1);
            word2HashMap.put(word2.charAt(i), word2HashMap.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!word1HashMap.keySet().equals(word2HashMap.keySet())) {
            return false;
        }

        List<Integer> word1Frequencies = new ArrayList<>(word1HashMap.values());
        List<Integer> word2Frequencies = new ArrayList<>(word2HashMap.values());

        Collections.sort(word1Frequencies);
        Collections.sort(word2Frequencies);

        return word1Frequencies.equals(word2Frequencies);
    }
}