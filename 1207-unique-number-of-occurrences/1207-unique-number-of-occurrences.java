class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqNum = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freqNum.put(arr[i], freqNum.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> uniqueFreq = new HashSet<>();
        for (Map.Entry<Integer, Integer> num : freqNum.entrySet()) {
            Integer frequency = num.getValue();
            if (uniqueFreq.contains(frequency)) {
                return false;
            }
            uniqueFreq.add(frequency);
        }

        return true;
    }
}