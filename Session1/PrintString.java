package Session1;

public class PrintString {

	private static void print(String str) {
		// TODO Auto-generated method stub

		if(str.length() == 0) {
			return;
		}
		
		char cc0th = str.charAt(0);//'J'
		System.out.println(cc0th); //my work
		
		String bachiKuchi = str.substring(1);
		print(bachiKuchi);//rec work
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("Java");
	}

}
