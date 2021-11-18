package Session6;

public class TowerOfHanoi {

	private static void toh(int n, char src, char helper, char des) {
		// TODO Auto-generated method stub

		if(n == 1) {
			System.out.println("move " + n + "th disk from " + src + " to " + des);
			return;
		}
		toh(n - 1, src, des, helper);
		System.out.println("move " + n + "th disk from " + src + " to " + des);
		toh(n - 1, helper, src, des);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toh(3, 'A', 'B', 'C');
	}

}
