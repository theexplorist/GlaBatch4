package Session6;

public class SubstringDeletioon {

	public static void main(String[] args) {
		String str = "coding";
		
		int n = str.length();
		int i = 3;
		str = str.substring(0, i) + str.substring(i + 1, n);
		//System.out.println(str.substring(0, i) + str.substring(i + 1, n));
		System.out.println(str);
	}
}
