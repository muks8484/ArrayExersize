package arrayExersize;

import java.util.Scanner;

public class AvrageOfArrEle {


		public static void avrageOfElement(int n, int res, int[] a) {
			for(int i=0; i<n;i++)
			{
				 res = res+a[i];

			}
			double avg = res/n;
			System.out.println(" Avarage of element is: " + avg);

			
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array : ");
		int n = sc.nextInt();
		int res = 0;
	int []a = new int[n];
	System.out.println(" Enter the element of array : ");

	for(int i= 0; i<a.length; i++) {
		a[i] = sc.nextInt();
	}
	
	avrageOfElement(n, res, a);
	

	}

}
