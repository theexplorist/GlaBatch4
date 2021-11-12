package Session5;

public class BacktrackingDemo {

	private static void ankur(char[] aryanHouse, int roomNo) {
		// TODO Auto-generated method stub

		if(roomNo == aryanHouse.length) {
			return;
		}
		aryanHouse[roomNo] = 'B';
		ankur(aryanHouse, roomNo + 1);
		aryanHouse[roomNo] = 'G'; //Backtracking/manually undo
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] aryanHouse = {'G', 'G', 'G'};
		ankur(aryanHouse, 0);
		
		for(char color : aryanHouse) {
			System.out.print(color + " ");
		}
		
	}

}
