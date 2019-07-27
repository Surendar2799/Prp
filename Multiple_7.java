package Guvi;
import java.util.Scanner;
public class Multiple_7 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		if(a%7==0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		n.close();
	}
}