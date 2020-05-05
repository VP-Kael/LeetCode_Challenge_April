/*
 Day 18

 Given a m x n grid filled with non-negative numbers,
 find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.

 Example:
    Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
    Output: 7
    Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        return minPathSum(grid,0,0,new int[grid.length][grid[0].length]);
    }

    public static int minPathSum(int[][] grid, int i, int j, int[][] cache) {
        if(i==grid.length-1 && j==grid[0].length-1)
            return grid[i][j];
        if(cache[i][j]>0)
            return cache[i][j];
        int down = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        if(i+1<grid.length)
            down = minPathSum(grid,i+1,j,cache);
        if(j+1<grid[i].length)
            right = minPathSum(grid,i,j+1,cache);
        cache[i][j] = grid[i][j] + Math.min(down,right);
        return cache[i][j];
    }
}
