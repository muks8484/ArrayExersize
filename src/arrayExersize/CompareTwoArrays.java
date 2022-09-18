package arrayExersize;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in );
		System.out.println(" Enter first array length :");
		int n1 = sc.nextInt();
		System.out.println(" Enter second array length :");
		int n2 = sc.nextInt();
		int []a = new int [n1];
		int []b = new int [n2];
		
		System.out.println(" Enter first array element :");
		for(int i =0; i<n1; i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println(" Enter second array element :");

		for(int i =0; i<n2; i++)
		{
			b[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		compareTwoArray(n2, a, b);
		System.out.println(compareTwoArray(n2, a, b));
		
		
		
	}

 static boolean compareTwoArray(int n1, int a[], int b[]) {
	if(a == b)
		return true;
	
	if(a==null||b==null || a.length!= b.length)
		return false;
	
	for(int i= 0; i<n1; i++)
	
		if(a[i]!=(b[i]))
		
			 return false;	
	
	return true;
	
		
}
}
