class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowFrequency = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> rowValues = new ArrayList<>();
            for(int value : row) {
                rowValues.add(value);
            }

            rowFrequency.put(rowValues, rowFrequency.getOrDefault(rowValues, 0) + 1);
        }

        int count = 0;
        for (int col = 0; col < grid.length; col++) {
            List<Integer> columnValues = new ArrayList<>();
            
            for (int row = 0; row < grid.length; row++) {
                columnValues.add(grid[row][col]);
            }

            count+=rowFrequency.getOrDefault(columnValues, 0);
        }

        return count;
    }
}