package Session2;

public class FirstOccurence {

	private static int firstInd(int[] arr, int ci, int search) {
		// TODO Auto-generated method stub

		if(ci == arr.length) {
			return -1;
		}
		//mera kaam
		if(arr[ci] == search) {
			return ci;
		}
		
		//rec ka kaam
		int recAns = firstInd(arr, ci + 1, search);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {10, 20, 30, 20, 40};
		System.out.println(firstInd(arr, 0, 50));
	}

}
