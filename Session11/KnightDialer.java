package Session11;

public class KnightDialer {

	static int[] rC = {-2, -1, 1, 2, -2, -1, 1, 2};
	static int[] cC = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static int sol(int n, int cr, int cc, int[][][] dp) {
		// TODO Auto-generated method stub

		if(cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		
		if(dp[n][cr][cc] != -1) {
			return dp[n][cr][cc];
		}
		int c1 = sol(n - 1, cr - 2, cc - 1, dp);
		int c2 = sol(n - 1, cr - 1, cc - 2, dp);
		int c3 = sol(n - 1, cr + 1, cc - 2, dp);
		int c4 = sol(n - 1, cr + 2, cc - 1, dp);
		int c5 = sol(n - 1, cr - 2, cc + 1, dp);
		int c6 = sol(n - 1, cr - 1, cc + 2, dp);
		int c7 = sol(n - 1, cr + 1, cc + 2, dp);
		int c8 = sol(n - 1, cr + 2, cc + 1, dp);
		
		return dp[n][cr][cc] = (c1 + c2 + c3 + c4 +c5 + c6 + c7 + c8) % 1000000007;
	}
	
	private static int sol2(int n, int cr, int cc, int[][][] dp) {
		// TODO Auto-generated method stub

		if(cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		
		if(dp[n][cr][cc] != -1) {
			return dp[n][cr][cc];
		}
//		int c1 = sol(n - 1, cr - 2, cc - 1, dp);i = 0
//		int c2 = sol(n - 1, cr - 1, cc - 2, dp);i = 1
//		int c3 = sol(n - 1, cr + 1, cc - 2, dp);i = 2
//		int c4 = sol(n - 1, cr + 2, cc - 1, dp);i = 3
//		int c5 = sol(n - 1, cr - 2, cc + 1, dp);i = 4
//		int c6 = sol(n - 1, cr - 1, cc + 2, dp);i = 5
//		int c7 = sol(n - 1, cr + 1, cc + 2, dp);i = 6
//		int c8 = sol(n - 1, cr + 2, cc + 1, dp);i = 7
		
		int ct = 0;
		for(int i = 0; i < 8; i++) {
			ct = (ct + sol2(n - 1, cr + rC[i], cc + cC[i], dp)) % 1000000007;
		}
		
		return dp[n][cr][cc] = (ct) % 1000000007;
	}
	//3 -> n, cr, cc
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3131;
		int ans = 0;
		int[][][] dp = new int[n + 1][4][3];
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 3; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		for(int cr = 0; cr < 4; cr++) {
			for(int cc = 0; cc < 3; cc++) {
				ans = (ans +  sol2(n - 1, cr, cc, dp)) % 1000000007; 
			}
		}
		
		System.out.println(ans);
	}

}
