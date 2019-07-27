package Guvi;
import java.util.Scanner;
public class Number_Repetitions {
	public static void main(String[] args) {
	System.out.println("Enter the array size");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int [n];
	System.out.println("Enter the Repetition values");
	int b=s.nextInt();
	System.out.println("Enter the array values");
	int count=0;
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
		{
			if(a[i]==b)
				count++;
		}
	System.out.println(count);
	s.close();
	}
}