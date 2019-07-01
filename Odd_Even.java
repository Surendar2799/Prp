package prp;
import java.util.Scanner;
public class Odd_Even {
	public static void main(String[] args) {
		System.out.println("Enter the values");
		Scanner n=new Scanner (System.in);
		int a=n.nextInt();
		if(a%2==0)
		{
			System.out.println("Given " +a+ " is Even");
		}
		else
			System.out.println("Given " +a+ " is Odd");
		n.close();
	}
}
