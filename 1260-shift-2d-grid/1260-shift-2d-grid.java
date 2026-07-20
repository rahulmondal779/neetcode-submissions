class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rowsLength = grid.length;
        int columnsLength = grid[0].length;
        int total = rowsLength * columnsLength;

        int[][] shifted = new int[rowsLength][columnsLength];
        k %= total;

        for (int row = 0; row < rowsLength; row++) {
            for (int column = 0; column < columnsLength; column++) {
                int oldIndex = row * columnsLength + column;
                int newIndex = (oldIndex + k) % (rowsLength * columnsLength);

                int newRow = newIndex / columnsLength;
                int newCol = newIndex % columnsLength;
                shifted[newRow][newCol] = grid[row][column];
            }
        }

        List<List<Integer>> girds = new ArrayList<>();
        for (int i = 0; i < rowsLength; i++) {
            List<Integer> gridArray = new ArrayList<>();
            for (int j = 0; j < columnsLength; j++) {
                gridArray.add(shifted[i][j]);
            }
            girds.add(gridArray);
        }

        return girds;
    }
}