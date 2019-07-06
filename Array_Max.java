package Guvi;
import java.util.Scanner;
public class Array_Max {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array values");
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]>max)
				max=a[j];
		}
		System.out.println(max);
		m.close();
	}
}