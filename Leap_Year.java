package prp;
import java.util.Scanner;
public class Leap_Year {
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		if(a%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
		n.close();
	}
}