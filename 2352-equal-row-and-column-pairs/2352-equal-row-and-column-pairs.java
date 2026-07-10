class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<Integer, List<Integer>> rowHashMap = new HashMap<>();
        HashMap<Integer, List<Integer>> colHashMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                rowHashMap.computeIfAbsent(i, key -> new ArrayList<>()).add(grid[i][j]);
                colHashMap.computeIfAbsent(j, key -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        int count = 0;
        for (List<Integer> rowValues : rowHashMap.values()) {
            for (List<Integer> colValues : colHashMap.values()) {
                if (rowValues.equals(colValues)) {
                    count++;
                }
            }
        }

        return count;
    }
}