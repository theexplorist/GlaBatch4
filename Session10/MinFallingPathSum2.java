package Session11;

public class MinFallingPathSum2 {

	public int minFallingPathSum(int[][] matrix) {
        int minAns = Integer.MAX_VALUE;
        for(int cc = 0; cc < matrix.length; cc++) {
            int ans = sol(matrix, 0, cc);
            System.out.println(ans);
            minAns = Math.min(minAns, ans);
        }
        
        return minAns;
    }
    
    public int sol(int[][] grid, int cr, int cc) {
        
        if(cr == grid.length - 1) {
			return grid[cr][cc];
		}
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < grid.length; i++) {
            if(cc != i) {
                ans = Math.min(ans, sol(grid, cr + 1, i));
            }
        }
        
        return ans + grid[cr][cc];
    }
}
