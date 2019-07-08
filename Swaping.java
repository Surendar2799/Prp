package Guvi;
import java.util.Scanner;
public class Swaping {
	public static void main(String[] args) {
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swap " +a+ " "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After swap "+a+" "+b);
		s.close();
	}
}