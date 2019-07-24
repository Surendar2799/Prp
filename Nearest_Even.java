package Guvi;
import java.util.Scanner;
public class Nearest_Even {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		if(a%2==0)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(a-1);
		}
		n.close();
	}
}