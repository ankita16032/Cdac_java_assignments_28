//2.    Reverse a given Array and print.
package assignments_28;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Output: "+Arrays.toString(arr));
	}

}
/*
 Output: [6, 5, 4, 3, 2, 1]
 */