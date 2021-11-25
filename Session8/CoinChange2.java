package Session8;

import java.util.Arrays;

public class CoinChange2 {

	// 2 states - cA, currI -> 2D cache
	private static int sol(int tarAmount, int[] coins, int cA, int currI, int n, int[][] cache) {
		// TODO Auto-generated method stub

		if (tarAmount == cA) {
			return 1;
		}

		if (currI == n) {
			return 0;
		}
		
		if(cache[cA][currI] != -1) {
			return cache[cA][currI];
		}
		int pick = 0, dontPick = 0;

		if (coins[currI] + cA <= tarAmount) {
			// System.out.println(cA);
			pick = sol(tarAmount, coins, cA + coins[currI], currI, n, cache);
		}

		dontPick = sol(tarAmount, coins, cA, currI + 1, n, cache);
		return cache[cA][currI] = pick + dontPick;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = { 1, 2, 5 };
		int n = coins.length;

		int amount = 5;
		int[][] cache = new int[amount + 1][n + 1];

		for (int[] arr : cache) {
			Arrays.fill(arr, -1);
		}
		System.out.println(sol(amount, coins, 0, 0, n, cache));
	}

}
