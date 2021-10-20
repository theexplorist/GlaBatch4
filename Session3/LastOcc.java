package Session3;

public class LastOcc {

	private static int lastOcc(int[] arr, int ci, int search) {
		// TODO Auto-generated method stub

		if(ci == -1) {//aap left mein array se bahar ho chuke ho
			return -1;//Not found
		}
		if(arr[ci] == search) {
			return ci;
		}
		
		int recAns = lastOcc(arr, ci - 1, search);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 20, 40};
		int lastIndex = arr.length - 1;
		System.out.println(lastOcc(arr, lastIndex, 20)); //(arr, 4, 20)
	}

}
