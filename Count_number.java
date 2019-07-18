package Guvi;
import java.util.Scanner;
public class Count_number {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int c=a.length();
		System.out.println(c);
		s.close();
	}
}