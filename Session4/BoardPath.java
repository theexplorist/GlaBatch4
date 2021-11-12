package Session4;

public class BoardPath {

	private static void printPaths(int curr, int dest, String path) {
		// TODO Auto-generated method stub

		if(curr > dest) {
			return;
		}
		
		if(curr == dest) {
			System.out.println(path);
			return;
		}
		
		printPaths(curr + 1, dest, path + '1');
		printPaths(curr + 2, dest, path + '2');
		printPaths(curr + 3, dest, path + '3');
		printPaths(curr + 4, dest, path + '4');
		printPaths(curr + 5, dest, path + '5');
		printPaths(curr + 6, dest, path + '6');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths(0, 10, "");
	}

}
