package Session3;

public class LastOcc2 {

	private static int lastOcc(int[] arr, int ci, int search) {
		// TODO Auto-generated method stub

		if(ci == arr.length) {
			return -1;
		}
		
		int recAns = lastOcc(arr, ci + 1, search);
		
		if(recAns == -1 && arr[ci] == search) {//element ni mila tabhi search kro
			return ci;
		}
		
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 20, 40};
		//int lastIndex = arr.length - 1;
		System.out.println(lastOcc(arr, 0, 20));
	}

}
