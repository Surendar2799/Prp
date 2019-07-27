package Guvi;
import java.util.Scanner;
public class Check_K_Exists {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the check numbers");
		int b=m.nextInt();
		System.out.println("Enter the array values");
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				count=1;
			}
		}
		if(count==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		m.close();
	}
}