package Session11;

public class MinimumFallingPathSum {

	private int sol(int[][] cost, int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub

		if(cc > ec || cc < 0) {
			return Integer.MAX_VALUE;
		}
		
		if(cr == er) {
			return cost[cr][cc];
		}
		int c1 = sol(cost, cr + 1, cc - 1, er, ec);
		int c2 = sol(cost, cr + 1, cc, er, ec);
		int c3 = sol(cost, cr + 1, cc + 1, er, ec);
		return Math.min(c1, Math.min(c2, c3)) + cost[cr][cc];
	}
}
