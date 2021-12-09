package Session12;

import java.util.Stack;

public class FormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		String st = "IDIDI";
		int n = st.length();
		for(int i = 0; i < n + 1; i++) {
			s.push(i + 1);
			
			//popping conditions -> curr char is I or i == n
			if(i == n || st.charAt(i) == 'I') {
				//pop krke print krna hai
				while( !s.isEmpty()) {
					System.out.print(s.pop());
				}
			}
		}
	}

}
