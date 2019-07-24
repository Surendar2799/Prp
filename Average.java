package Guvi;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		int c=0;
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c=c+a[i];
		}
		int avg=c/n;
		System.out.println(avg);
		m.close();
	}
}