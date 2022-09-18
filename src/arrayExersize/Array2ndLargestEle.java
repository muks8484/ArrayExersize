package arrayExersize;

import java.util.Scanner;

public class Array2ndLargestEle {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println(" Enter Array size :");
		int n = sc.nextInt();
		int []a = new int[n];
		System.out.println(" Enter Array elements : ");
		for(int i = 0; i<n ; i++) {
			 a[i]= sc.nextInt();
		}
		secondLargestEle(a);
		
	}

	public static void secondLargestEle(int []a) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int  temp = 0;
		int size = a.length;
		for(int i= 0; i<a.length; i++)
		{
			for(int j = 0;  j<a.length; j++)
			if(a[i]<a[j]) {
				  temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
			}
		}		System.out.println(a[a.length]);
		System.out.println(" Sorted array is : ");
		for(int i =0; i<a.length; i++)
		{
			System.out.print("   "+ a[i]);

		}
		System.out.println(" \n Largest element is: " +a[size-2]);
	}

}
