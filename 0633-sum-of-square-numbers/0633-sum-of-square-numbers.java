class Solution {
    public boolean judgeSquareSum(int c) {
        long right = (long) Math.sqrt(c);
        long left = 0;

        while (left<=right) {
            long squareSum = left * left + right * right;
            if (squareSum == c) {
                return true;
            } else if (squareSum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}