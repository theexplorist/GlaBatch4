package Session4;

public class GenerateAllSubsequences {

	private static void printSubs(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		
		char cc0th = inp.charAt(0);
		String rosInp = inp.substring(1);
		printSubs(rosInp, out);
		printSubs(rosInp, out + cc0th);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSubs("abc", "");
	}

}
