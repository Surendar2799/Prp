package Guvi;
import java.util.Scanner;
public class First_K_Char {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		String str=n.nextLine();
		int a=n.nextInt();
		String b=str.substring(0,a);
		System.out.println(b);
		n.close();
	}
}