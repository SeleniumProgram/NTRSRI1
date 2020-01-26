package secondjavapackage;

public class ArrayExample {
	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println(arr.length);

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		arr[10] = 10;
		// for loop

		for (int x = arr.length - 1; x >= 0; x--) {
			System.out.println(arr[x]);
		}

	}
}
