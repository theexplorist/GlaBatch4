package Session2;

public class ReversePrintString {

	private static void print(String str) {
		// TODO Auto-generated method stub

		//base case
		if(str.length() == 0) {
			return;
		}
		
		//rec ka kaam
		String bachiKuchi = str.substring(1);
		print(bachiKuchi);
		
		//apne ko print - cc0th
		char cc0th = str.charAt(0);
		System.out.println(cc0th);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("Java");
	}

}
