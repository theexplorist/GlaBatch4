package Session2;

public class PrintDecreasing {

	private static void print(int n) {
		// TODO Auto-generated method stub

		if(n == 0) {
			return;
		}
		
		print(n - 1);
		System.out.println(n);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   print(5);
	}

}
