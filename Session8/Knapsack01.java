package Session8;

import java.util.Arrays;

public class Knapsack01 {

	private static int maxP(int curr, int n, int[] price, int[] wt, int bagC, int[][] cache) {
		// TODO Auto-generated method stub

		if(bagC == 0 || curr == n) {
			return 0;
		}
		
		if(cache[bagC][curr] != -1) {
			return cache[bagC][curr];
		}
		int rob = 0, dontRob = 0;
		
		if(wt[curr] <= bagC) {
			rob = price[curr] + maxP(curr + 1, n, price, wt, bagC - wt[curr], cache);
		}
		
		dontRob = maxP(curr + 1, n, price, wt, bagC, cache);
		
		return cache[bagC][curr] = Math.max(rob, dontRob);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] wt = {3, 2, 4, 5, 1};
		int[] p = {4, 3, 5, 6, 1};
		int n = wt.length;
		int bagC = 11;
		int[][] cache = new int[bagC + 1][n + 1];
		
		for(int[] arr : cache) {
			Arrays.fill(arr, -1);
		}
		System.out.println(maxP(0, wt.length, p, wt, bagC, cache));
	}

}
