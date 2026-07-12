class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> arrRank = new HashMap<>();
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int currentRank = 1;

        for (int i = 0; i < sorted.length; i++) {
            if (!arrRank.containsKey(sorted[i])) {
                arrRank.put(sorted[i], currentRank);
                currentRank++;
            }
        }

        int[] rank = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rank[i] = arrRank.get(arr[i]);
        }

        return rank;
    }
}