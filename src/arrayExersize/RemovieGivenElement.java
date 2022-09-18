package arrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class RemovieGivenElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array element : ");
		for(int i = 0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Given array is: \n "+Arrays.toString(a));
		
		System.out.println("Enter removing element : ");
		
		int el = sc.nextInt();
		System.out.println(" After removing element array is :");

		removeGivenElement(a, el);
		
	}

	private static void removeGivenElement(int a[],int el) {
		for(int i= 0; i<a.length; i++)
		{
			if(a[i] != el)
			{
				System.out.print(" "+a[i]);
			}
		}
	}

}
