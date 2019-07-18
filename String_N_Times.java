package Guvi;
import java.util.Scanner;
public class String_N_Times {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner n=new Scanner(System.in);
		String s=n.nextLine();
		System.out.println("Enter the N");
		int a=n.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println(s);
		}
		
		

	}

}
