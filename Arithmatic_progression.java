package Guvi;
import java.util.Scanner;
public class Arithmatic_progression {
	public static void main(String[] args) {
		System.out.println("Enter the A,D and N values");
		Scanner m=new Scanner (System.in);
		int n=m.nextInt();
		int a=m.nextInt();
		int d=m.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a;
			a=a+d;
		}
		System.out.println(sum);
		m.close();
	}
}