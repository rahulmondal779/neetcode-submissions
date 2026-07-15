class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;
        int countOdd = 0, countEven = 0;

        int i = 1;
        while (countEven <n || countOdd < n) {
            if (i%2 == 1 && countOdd < n) {
                countOdd++;
                sumOdd+=i;
            } else if (i%2 == 0 && countEven < n) {
                countEven++;
                sumEven+=i;
            }
            i++;
        }

        return greatestCommonDivisor(sumEven, sumOdd);
    }

    public int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}