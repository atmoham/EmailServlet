package com.samples;

public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 10, 20, 30 }, { 5, 10, 15, 20, 25 }, { 2, 4, 6, 8, 10, 12 }, { 99, 999 } };
		// Display the array values.

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Row " + i + " elements: ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		// Find min value of the above matrix.
		int m = arr[0][0];
		int x = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				m = Math.min(m, arr[i][j]);
				x = Math.max(x, arr[i][j]);
			}
		}
		System.out.println("\nThe smallest value from the above array: " + m);
		System.out.println("\nThe biggest value from the above array: " + x);
	}

}
