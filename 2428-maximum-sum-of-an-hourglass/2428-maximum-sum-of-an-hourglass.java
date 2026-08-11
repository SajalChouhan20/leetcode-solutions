class Solution {
    public int maxSum(int[][] grid) {
        int maxHourglassSum = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                int currentSum = grid[i][j]   + grid[i][j+1]   + grid[i][j+2]
                                              + grid[i+1][j+1]
                               + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                
                maxHourglassSum = Math.max(maxHourglassSum, currentSum);
            }
        }

        return maxHourglassSum;
    }
}