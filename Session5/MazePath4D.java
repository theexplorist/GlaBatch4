package Session5;

public class MazePath4D {

	private static void printPath(int cr, int cc, int dr, int dc, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if(cr == dr && cc == dc) {
			System.out.println(path);
			return;
		}
		
		if(cr < 0 || cc < 0 || cr > dr || cc > dc || vis[cr][cc]) {
			return;
		}
		
		vis[cr][cc] = true;
		//Up
		printPath(cr - 1, cc, dr, dc, path + 'U', vis);
		//Down
		printPath(cr + 1, cc, dr, dc, path + 'D', vis);
		//Left
		printPath(cr, cc - 1, dr, dc, path + 'L', vis);
		//right
		printPath(cr, cc + 1, dr, dc, path + 'R', vis);
		vis[cr][cc] = false;
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		int m = 3;
		
		printPath(0, 0, n - 1, m - 1, "", new boolean[n][m]);
	}

}
