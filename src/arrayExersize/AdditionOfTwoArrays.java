package arrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter frist Array length :");
		int n1 = sc.nextInt();
		System.out.print(" Enter second Array length :");
		int n2 = sc.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n2];
		int[] c = new int[n1];

		if (n1 != n2) {
			System.out.println(" Both Arrays Have same element ");
			return;
		} else {
			n1 = n2;
		}
		System.out.print(" Enter first Array element :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print(" Enter second Array element :");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		additionOfTwoArrays(n2, n2, a, b, c);

	}

	static void additionOfTwoArrays(int n1, int n2, int[] a, int[] b, int c[]) {

		for (int i = 0; i < a.length; i++) {

			c[i] = a[i] + b[i];

		}
		System.out.println(" Addition of two arrays is : ");
//		for(int i = 0; i<a.length; i++) {
		System.out.print(Arrays.toString(c));
//		}
	}

}
