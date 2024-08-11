class Solution {

    void DFS(int[][] grid, int i, int j, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || grid[i][j] == 0) {
            return;
        }
        vis[i][j] = true; // mark visited

        DFS(grid, i + 1, j, vis);
        DFS(grid, i - 1, j, vis);
        DFS(grid, i, j + 1, vis);
        DFS(grid, i, j - 1, vis);
    }

    int numberofIslands(int[][] grid, int m, int n) {
        int islands = 0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) { // land
                    DFS(grid, i, j, vis);
                    islands++;
                }
            }
        }
        return islands; // Return the number of islands
    }

    public int minDays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int islands = numberofIslands(grid, m, n);
        if (islands > 1 || islands == 0) {
            return 0; // The grid is already disconnected or empty
        } else { // We have only one island
            // Check if we can disconnect the grid in one day
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        grid[i][j] = 0; // convert to water
                        islands = numberofIslands(grid, m, n);

                        if (islands > 1 || islands == 0) {
                            return 1; // We can disconnect the island in one day
                        }

                        grid[i][j] = 1; // make it land again and try next cell
                    }
                }
            }
        }
        return 2; // If it is not possible to disconnect in one day
    }
}
