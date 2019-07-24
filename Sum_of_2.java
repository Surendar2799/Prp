package Guvi;
import java.util.Scanner;
public class Sum_of_2 {
	public static void main(String[] args) {
		System.out.println("Enter the two values");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		int c=a+b;
		System.out.println(c);
		n.close();
	}
}