class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;

        long total = 0;
        for (int[] arr : grid) {
            for (int x : arr) {
                total += x;
            }
        }

        if ((total & 1) == 1) return false;

        long target = total / 2;

        long sum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
            if (sum == target) return true;
        }

        sum = 0;  
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                sum += grid[i][j];  
            }
            if (sum == target) return true;
        }

        return false;
    }
}