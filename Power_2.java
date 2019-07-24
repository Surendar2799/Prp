package Guvi;
import java.util.Scanner;
public class Power_2 {
	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the values");
	double b=n.nextInt();
	double  c= Math.sqrt(b);
	if(c==2 || b==2)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("No");
	}
	n.close();
	}
}