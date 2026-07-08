class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashNums1 = new HashSet<>();
        HashSet<Integer> hashNums2 = new HashSet<>();

        for (int num : nums1) {
            hashNums1.add(num);
        }

        for (int num : nums2) {
            hashNums2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (Integer integer : hashNums1) {
            if (!hashNums2.contains(integer)) {
                list1.add(integer);
            }
        }
        for (Integer integer : hashNums2) {
            if (!hashNums1.contains(integer)) {
                list2.add(integer);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}