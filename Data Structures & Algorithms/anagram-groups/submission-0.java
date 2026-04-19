class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str:strs) {
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sortedArray = new String(charStr);
            res.putIfAbsent(sortedArray, new ArrayList<>());
            res.get(sortedArray).add(str);
        }

        return new ArrayList<>(res.values());
    }
}