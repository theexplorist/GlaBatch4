package Session11;

import java.util.List;

public class Triangle {

	private static int sol(List<List<Integer>> cost, int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub

		if(cr == cost.size() - 1) {
			return cost.get(cr).get(cc);
		}
		int c1 = sol(cost, cr + 1, cc, er, ec);
		int c2 = sol(cost, cr + 1, cc + 1, er, ec);
		
		return Math.min(c1, c2) + cost.get(cr).get(cc);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
