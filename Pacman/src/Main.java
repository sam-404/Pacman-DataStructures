public class Main {

	static void printTD(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				System.out.print("_");
			else if (arr[i] == 1)
				System.out.print("-");
			else
				System.out.println(" ! Error ! " + arr[i] + i);
			if (i % 75 == 0 && i != 0)
				System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {0,1,0,0};
		int [] arr1 = {1,0,0,0,0,0,0,0};
		printTD(arr);
		printTD(arr1);
		
	}
}