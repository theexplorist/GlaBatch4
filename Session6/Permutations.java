package Session6;

public class Permutations {

	static int count;
	private static void permPerm(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			count++;
			System.out.println(out);
			return;
		}
		
		for(int i = 0; i < inp.length(); i++) {
			char ccith = inp.charAt(i);
			permPerm(inp.substring(0, i) + inp.substring(i + 1), out + ccith);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = 5;
		while(t-- != 0) {
			count= 0;
			permPerm("cab", "");
			System.out.println(count);
		}
		
	}

}
