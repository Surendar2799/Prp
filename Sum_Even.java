package Guvi;
import java.util.Scanner;
public class Sum_Even {
	public static void main(String[] args) {
		System.out.println("Enter the two values");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		int c=a+b;
		if(c%2==0)
		{
		System.out.println("Even");
		}
		else
			System.out.println("Odd");
		n.close();
	}
}