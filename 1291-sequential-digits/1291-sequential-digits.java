class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> sortedIntegers = new ArrayList<>();
        for (int start = 1; start <= 9; start++) {
            int num = start;

            for (int nextDigit = start + 1; nextDigit <= 9; nextDigit++) {
                num = num * 10 + nextDigit;

                if (num > high) {
                    break;
                }

                if (num >= low) {
                    sortedIntegers.add(num);
                }
            }
        }

        Collections.sort(sortedIntegers);

        return sortedIntegers;
    }
}