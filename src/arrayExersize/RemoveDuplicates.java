package arrayExersize;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 2, 2, 5, 5, 6, 8 };
		int i;
		int j;
		int count;
		System.out.println(" updated array is :");

		for (j = 0; j < a.length; j++) {
			 count = 0;
			for (i = j+1; i < a.length; i++) {
				if (a[j] == a[i]) {
					count++;

				}

			}

			if(count<1) {
				System.out.print("  " +a[j]);
			}


		}

	}
}