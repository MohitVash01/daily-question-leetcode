class Solution {

    public void numberofIslandsDFS(int matrix[][], int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 1) {
            return;
        }
        matrix[i][j] = 1; // marked as visited

        numberofIslandsDFS(matrix, i + 1, j);
        numberofIslandsDFS(matrix, i - 1, j);
        numberofIslandsDFS(matrix, i, j + 1);
        numberofIslandsDFS(matrix, i, j - 1);
    }

    public int regionsBySlashes(String[] grid) {
        int rows = grid.length;
        int cols = grid[0].length();

        int region = 0;

        int matrix[][] = new int[rows * 3][cols * 3];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i].charAt(j) == '/') {  // Fix: Use charAt() instead of array-style indexing
                    matrix[i * 3][j * 3 + 2] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3] = 1;
                } else if (grid[i].charAt(j) == '\\') {  // Fix: Use charAt() instead of array-style indexing
                    matrix[i * 3][j * 3] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }

        // DFS traversal to count regions
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    region++;
                    numberofIslandsDFS(matrix, i, j); // mark all connected parts
                }
            }
        }
        return region;
    }
}
class Solution {

    public void numberofIslandsDFS(int matrix[][], int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 1) {
            return;
        }
        matrix[i][j] = 1; // marked as visited

        numberofIslandsDFS(matrix, i + 1, j);
        numberofIslandsDFS(matrix, i - 1, j);
        numberofIslandsDFS(matrix, i, j + 1);
        numberofIslandsDFS(matrix, i, j - 1);
    }

    public int regionsBySlashes(String[] grid) {
        int rows = grid.length;
        int cols = grid[0].length();

        int region = 0;

        int matrix[][] = new int[rows * 3][cols * 3];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i].charAt(j) == '/') {  // Fix: Use charAt() instead of array-style indexing
                    matrix[i * 3][j * 3 + 2] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3] = 1;
                } else if (grid[i].charAt(j) == '\\') {  // Fix: Use charAt() instead of array-style indexing
                    matrix[i * 3][j * 3] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }

        // DFS traversal to count regions
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    region++;
                    numberofIslandsDFS(matrix, i, j); // mark all connected parts
                }
            }
        }
        return region;
    }
}
