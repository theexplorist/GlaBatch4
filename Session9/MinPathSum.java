package Session9;

import java.util.Arrays;

public class MinPathSum {

	//cr -> m, cc -> n, 2D
	private static int sol(int[][] cost, int cr, int cc, int dr, int dc, int[][] dp) {
		// TODO Auto-generated method stub

		if(cr > dr || cc > dc) {
			return Integer.MAX_VALUE;
		}
		if(cr == dr && cc == dc) {
			return cost[cr][cc];
		}
		
		if(dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
 		int down = sol(cost, cr + 1, cc, dr, dc, dp);
		int right = sol(cost, cr, cc + 1, dr, dc, dp);
		
		return dp[cr][cc] = Math.min(down, right) + cost[cr][cc];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] cost = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
		int m = cost.length;
		int n = cost[0].length;
		
		int[][] dp = new int[m + 1][n + 1];
		
		Arrays.fill(dp, -1);
		System.out.println(sol(cost, 0, 0, cost.length - 1, cost[0].length - 1, dp));
	}

}
