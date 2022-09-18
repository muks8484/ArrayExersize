package arrayExersize;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Array size: ");
		int n = sc.nextInt();
		int temp = 0;
		int a[] = new int[n];
		System.out.println(" Enter the array elements: ");
		for( int i = 0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
			
		}
		
		asendingOrder(a, temp);
		desendingOrder(a, temp);
		
			
	}

	 private static void desendingOrder(int []a, int temp) {
		
		 for(int i = 0; i<a.length; i++)
		 {
			 for(int j = 0; j<a.length; j++) {
				 
				 if(a[i]>a[j])
				 {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
					 
				 }
				 
			 }
			 

		 }
		 System.out.println(" Desending Order ");
		 for(int i= 0; i<a.length; i++)
		 {
			 System.out.println(a[i]);
		 }
		 
	}



	static void asendingOrder(int []a, int temp) {
		 for(int i = 0; i<a.length; i++)
		 {
			 for(int j = 0; j<a.length; j++) {
				 
				 if(a[i]<a[j])
				 {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
					 
				 }
				 
			 }
			 

		 }
		 System.out.println(" Asending Order ");
		 for(int i= 0; i<a.length; i++)
		 {
			 System.out.println(a[i]);
		 }
		 
	}

}
