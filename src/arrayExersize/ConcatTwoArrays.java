package arrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Size of first array: ");
		int n1= sc.nextInt();
		System.out.println(" Enter the Size of second array: ");
		int n2 =sc.nextInt();
		
		int []a= new int[n1];
		int []b = new  int[n2];
		int c[] = new int [n1+n2];
		System.out.println(" Enter the element of first array: ");

		for(int i= 0; i<a.length; i++) {
			a[i]= sc.nextInt();		
			}
		System.out.println(" Enter the element of second array: ");

		for(int i= 0; i<a.length; i++) {
			b[i]= sc.nextInt();		
			}
		concatOfTwoArrays(n2, n2, a, b, c);
	}
//  concatination of two arrays using for loops
	 static void concatOfTwoArrays(int n1, int n2, int a[], int b[],int[]c) {
		 int index = 0;

		 for(int aa:a )
		 {
			c[index++]=aa;
		 }
		 for(int bb: b)
		 {
			 c[index++]=bb;
		 }
		 System.out.println(" Concated arrays is :");
		 System.out.println(Arrays.toString(c));
	}

}
