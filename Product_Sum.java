package Guvi;
import java.util.Scanner;
public class Product_Sum {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		int c=a*b;
		if(c%2==0)
		{
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
		n.close();
	}
}