package Session4;

public class KeypadCombinations {

	private static String mapping(char cDigit) {
		// TODO Auto-generated method stub

		if(cDigit == '2') {
			return "abc";
		} else if(cDigit == '3') {
			return "def";
		} else if(cDigit == '4') {
			return "ghi";
		} else if(cDigit == '5') {
			return "jkl";
		} else if(cDigit == '6') {
			return "mno";
		} else if(cDigit == '7') {
			return "pqrs";
		}
		
		return "";
	}
	
	private static void printCombinations(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		
		char cc0th = inp.charAt(0);//2
		String mappedString = mapping(cc0th);//abc
		
		for(int i = 0; i < mappedString.length(); i++) {
			String ros = inp.substring(1);
			printCombinations(ros, out + mappedString.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCombinations("273", "");

	}

}
