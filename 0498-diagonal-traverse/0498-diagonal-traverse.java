class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        boolean upward = true;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if (upward) {
                // Moving up-right
                if (col == n - 1) {
                    row++;       // Hit right boundary
                    upward = false;
                } else if (row == 0) {
                    col++;       // Hit top boundary
                    upward = false;
                } else {
                    row--;
                    col++;
                }
            }
            else {
                // Moving down-left
                if (row == m - 1) {
                    col++;       // Hit bottom boundary
                    upward = true;
                } else if (col == 0) {
                    row++;       // Hit left boundary
                    upward = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
        // int n = mat.length;
        // int m = mat[0].length;

        // List<Integer> map = new ArrayList<>();
        // for (int i = 0; i < m + n - 1; i++) {
        //     List<Integer> dia = new ArrayList<>();
        //     int r = (i < m) ? 0 : i - m + 1;
        //     int c = (i < m) ? i : m - 1;

        //     while (r < n && c >= 0) {
        //         dia.add(mat[r][c]);
        //         r++;
        //         c--;
        //     }

        //     if (i % 2 == 0) {
        //         Collections.reverse(dia);
        //     }

        //     map.addAll(dia);
        // }
        // int[] result = new int[map.size()];
        // for (int i = 0; i < map.size(); i++) {
        //     result[i] = map.get(i);
        // }
        // return result;
    }
}