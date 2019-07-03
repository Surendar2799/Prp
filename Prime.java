package Guvi;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number");
		int s=n.nextInt();
		boolean b=true;
		for(int i=2;i<s;i++)
			if(s%i==0)
			{
				b=false;
			    break;
			}
		if(b)
			System.out.println("It is prime");
		else
			System.out.println("It is not a prime");
		n.close();
	}
}
