public class Main {
    // static int x = 6;
    // static double[] arr = {4.5, 6, 9.0, 8};
    // static boolean[] arr = new boolean[100];
    // static int[][] board = new int[3][3];

    public static void main(String[] args) {
        // int x = 6;
		// System.out.println(x + 4);
		// System.out.println(x);
		// System.out.println(x % 2 == 0);

        // System.out.println("x: " + x);
		// // reassigning the value of x to be the old x plus 4
		// x = x + 4;
		// System.out.println("new x: " + x);

        // to find the length of an array, use array.length
		// System.out.println(arr.length);

        // System.out.println(arr[0]);
		// // setting the 4th element in arr to true
		// arr[3] = true;
		// System.out.println(arr[0] || arr[3]);
		// System.out.println(arr.length);

        // // to start, let's extract the first row
		// // (aka the first element in the array)
		// int[] firstRow = board[0];
		// // now, we'll get the first value in that row
		// int firstVal = firstRow[0];
		// System.out.println(firstVal);

        // int firstVal = board[0][0];
		// System.out.println(firstVal);

        // int[] fib = {1, 1, 2, 3, 5, 8, 13};
		// int sum = 0;
		// for (int e : fib) {
		// 	// add each element of fib to sum
		// 	sum = sum + e;
		// }
		// System.out.println(sum);

        // int[] arr = new int[100];
		// int index = 0;
		// while (index < 100) {
		// 	if (index % 2 == 0) {
		// 		arr[index] = 2;
		// 	} else {
		// 		arr[index] = 1;
		// 	}
		// 	index = index + 1;
		// }

        // int[] arr = new int[100];
		// int index = 0;
		// while (index < 100) {
		// 	arr[index] = 2 - index % 2;
		// 	index = index + 1;
		// }

        int[] arr = new int[100];
		for (int index = 0; index < 100; index = index + 1) {
			arr[index] = 2 - index % 2;
		}

    }
}