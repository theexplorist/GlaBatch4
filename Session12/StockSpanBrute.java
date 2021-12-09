package Session12;

import java.util.Arrays;

public class StockSpanBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {6, 4, 1, 2,  4, 3, 5};
		
		int[] span = new int[ht.length];
		//span[0] = 1;
		Arrays.fill(span, 1);
		//o(n*n)
		for(int curr = 1; curr < ht.length; curr++) {
			
			for(int prev = curr - 1; prev >= 0; prev--) {
				if(ht[prev] <= ht[curr]) {
					span[curr]++;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(span));
	}

}
