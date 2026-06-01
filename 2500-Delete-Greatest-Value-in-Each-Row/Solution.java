import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        
        int totalAnswer = 0;
        int numColumns = grid[0].length;
        
        for (int col = numColumns - 1; col >= 0; col--) {
            int currentMaxOfStep = 0;
            
            for (int row = 0; row < grid.length; row++) {
                currentMaxOfStep = Math.max(currentMaxOfStep, grid[row][col]);
            }
            
            totalAnswer += currentMaxOfStep;
        }
        
        return totalAnswer;
    }
}

