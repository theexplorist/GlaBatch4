package Session3;

public class Nthfibonacci {

	
	private static int nthFib(int n) {
		// TODO Auto-generated method stub

		if(n == 0 || n == 1) {
			return n;
		}
		
		//rec works - 2
		int fibN_1 = nthFib(n - 1);//gyan
		int fibN_2 = nthFib(n - 2);//priyanshi 
		
		//my work
		int fibN = fibN_1 + fibN_2;
		return fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nthFib(3));
	}

}
