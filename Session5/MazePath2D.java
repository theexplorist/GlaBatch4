package Session5;

public class MazePath2D {

	private static void printPaths(int cr, int cc, int dr, int dc, String path) {
		// TODO Auto-generated method stub

		if(cr == dr && cc == dc) {
			System.out.println(path);
			return;
		}
		
		if(cr > dr || cc > dc) {
			return;
		}
		
		printPaths(cr, cc + 1, dr, dc, path + 'H');//"Horizontally right"
		printPaths(cr + 1, cc, dr, dc, path + 'V');//"Vertically Down"
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		int m = 3;
		
		printPaths(0, 0, n - 1, m - 1, "");
	}

}
