//3.Find the second maximum and second minimum Elements of an array.
package assignments_28;

import java.util.Arrays;

public class Max_Min_2nd_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 7, 9 };
		Arrays.sort(arr);
		int secondMin = arr[1];
		int secondMax = arr[arr.length - 2];
		System.out.println("SecondMin: "+secondMin);
		System.out.println("SecondMax: "+secondMax);

	}

}
/*SecondMin: 2
SecondMax: 7*/