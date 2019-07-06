package Guvi;
import java.util.Scanner;
public class Array_Mim {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array values");
		int min=n;
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]<min)
				min=a[j];
		}
		System.out.println(min);
		m.close();
	}
}