package Guvi;
import java.util.Scanner;
public class Validate_String {
	public static void main(String[] args) {
		System.out.println("Enter the two String");
		Scanner str=new Scanner(System.in);
		String a=str.next();
		int a1=a.length();
		if(a1/2==0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		str.close();
	}
}