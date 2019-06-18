package Wipro;
import java.util.Scanner;
public class Fc_No_1 {
	public static void main(String[] args) {
		Scanner n=new Scanner (System.in);
		System.out.println("Enter the values");
		int s=n.nextInt();
		if(s>0)
			System.out.println("Given " +s+ " is Positive");
		else if(s<0)
			System.out.println("Given " +s+ " is Negative");
		else
			System.out.println("Given " +s+ " is Zero");
		n.close();
	}
}
