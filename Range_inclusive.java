package Guvi;
import java.util.Scanner;
public class Range_inclusive {
	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=1 && n<=10)
		{
			System.out.println("Yes");
		}
		else
		System.out.println("No");
	}
}