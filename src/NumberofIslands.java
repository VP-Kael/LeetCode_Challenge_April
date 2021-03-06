/*
 Day 17

 Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 You may assume all four edges of the grid are all surrounded by water.

 Example 1:
    Input:
        11110
        11010
        11000
        00000
    Output: 1

  Example 2:
    Input:
        11000
        11000
        00100
        00011
    Output: 3
 */

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        boolean[][] visited = new boolean[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                ans += dfs(grid, m, n, visited, r, c);
            }
        }
        return ans;
    }

    int[] DIR = new int[]{0, 1, 0, -1, 0};
    int dfs(char[][] grid, int m, int n, boolean[][] visited, int r, int c) {
        if (r < 0 || r == m || c < 0 || c == n || visited[r][c] || grid[r][c] == '0') return 0;
        visited[r][c] = true;
        for (int i = 0; i < 4; i++) {
            dfs(grid, m, n, visited, r + DIR[i], c + DIR[i+1]);
        }
        return 1;
    }
}
