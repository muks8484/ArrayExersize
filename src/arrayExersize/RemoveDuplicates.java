package arrayExersize;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 2, 2, 5, 5, 6, 8, 8 };
		int i;
		int j;
		int b[] = new int[a.length];
//		int count;
		System.out.println(" updated array is :");
		int k = 0;

		for ( i = 0; i < a.length; i++) {
			int count = 0;
			for ( j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
//					System.out.println(count);
				}

			}

			if (count < 1) {
				b[k] = a[i];
				k++;
//				System.out.println(a[i]);
			}

		}
		int c[] = new int[k];
		for (i = 0; i < c.length; i++)
			c[i] = b[i];

		System.out.println(Arrays.toString(c));

	}
}