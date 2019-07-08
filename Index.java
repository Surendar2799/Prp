package Guvi;
import java.util.Scanner;
public class Index {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+ " "+i);
		}
		s.close();
	}
}