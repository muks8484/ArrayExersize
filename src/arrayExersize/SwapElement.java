package arrayExersize;

import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array length : ");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the array element : ");
	for(int i = 0; i<a.length; i++) {	
		a[i]= sc.nextInt();
	}
	
		swapingElement(a);
		
		
	}

	private static void swapingElement(int []a) {
		for(int i=0; i<a.length; i++) {
			for(int j =1; j<a.length; j++) {
			int temp =a[i];
				a[i] = a[j];
				a[j]=temp;
				
		}
		}
		System.out.println("After Swaping array is: ");
		for(int element : a)
		{
			System.out.print(" "+element);
		}
		
	}

}
