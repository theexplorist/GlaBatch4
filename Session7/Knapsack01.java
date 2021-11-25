package Session7;

public class Knapsack01 {

	private int maxP(int curr, int n, int[] price, int[] wt, int bagC) {
		// TODO Auto-generated method stub

		if(bagC == 0 || curr == n) {
			return 0;
		}
		int rob = 0, dontRob = 0;
		
		if(wt[curr] <= bagC) {
			rob = price[curr] + maxP(curr + 1, n, price, wt, bagC - wt[curr]);
		}
		
		dontRob = maxP(curr + 1, n, price, wt, bagC);
		
		return Math.max(rob, dontRob);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
