package Guvi;
import java.util.Scanner;
public class Swaping_Bit_Wise {
	public static void main(String[] args) {
		System.out.println("Enter the two values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swap " +a+ " "+b);
	    a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap "+a+" "+b);
		s.close();
	}

}
