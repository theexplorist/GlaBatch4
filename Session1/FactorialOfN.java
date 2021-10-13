package Session1;

public class FactorialOfN {

	private static int fact(int n) {
		// TODO Auto-generated method stub

		//base case
		if(n == 0) {
			return 1;
		}
		
		//rec work
		int recAns = fact(n - 1);
		
		//my work
		int myAns = n * recAns;
		return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = fact(5);
		System.out.println(ans);
	}

}
