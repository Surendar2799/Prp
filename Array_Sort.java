package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Sort {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		m.close();
	}
}