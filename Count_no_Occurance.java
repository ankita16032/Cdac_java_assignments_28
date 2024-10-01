//4.Count the number of occurrence of each element of an array.

package assignments_28;

public class Count_no_Occurance {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		int count = 0;
		int n = 6;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		System.out.println("number of 6 ocuurs is: "+count);
	}
}
/*
number of 6 ocuurs is: 3
*/