package Session7;

import java.util.Arrays;

public class Nthfibonacci {

	
	private static long nthFib(int n, long[] cache) {
		// TODO Auto-generated method stub

		if(n == 0 || n == 1) {
			return n;
		}
		
		if(cache[n] != -1) {//overlapping 
			return cache[n];
		}
		//rec works - 2
		long fibN_1 = nthFib(n - 1, cache);//gyan
		long fibN_2 = nthFib(n - 2, cache);//priyanshi 
		
		//my work
		long fibN = fibN_1 + fibN_2;
		//cache[n] = fibN;
		return cache[n] = fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		long[] cache = new long[n + 1];
		
		Arrays.fill(cache, -1);
		System.out.println(nthFib(50, cache));
	}

}
