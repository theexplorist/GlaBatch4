package Session12;

import java.util.Stack;

public class JavaStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		
		if(!st.isEmpty()) {//better practice to avoid runtime exception
			st.pop();
		}
		
		//1
		System.out.println(st.isEmpty());//t or f
		
		//2
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		//System.out.println(st.isEmpty());//t or f
		
		//3
		System.out.println(st.size());
		
		//4
		System.out.println(st.pop());
		
		//5
		System.out.println(st.peek());
		
		//ref print
		System.out.println(st);
	}

}
