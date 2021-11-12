package Session4;

public class ClimbingStairs {

	private static void printPaths(int cStep, int dest, String path) {
		// TODO Auto-generated method stub

		if(cStep > dest) {
			return;
		}
		
		if(cStep == dest) {
			System.out.println(path);
			return;
		}
		
		printPaths(cStep + 1, dest, path + '1');
		printPaths(cStep + 2, dest, path + '2');
		printPaths(cStep + 3, dest, path + '3');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths(0, 3, "");
	}

}
