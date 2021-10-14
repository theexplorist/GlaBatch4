package Session2;

public class LengthhOfString {

	private static int length(String str) {
		// TODO Auto-generated method stub

		if(str.isEmpty()) {
			return 0;
		}
		
		String bachiKuchi = str.substring(1);
		int recL = length(bachiKuchi);
		
		int totalL = recL + 1;
		return totalL;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(length("Javafjdklfmnsd"));
	}

}
