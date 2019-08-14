package Rough;
import java.util.Scanner;
public class Binary_Representation {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner n=new Scanner (System.in);
		int a=n.nextInt();
		int r=0;
		boolean b=true;
		while(a>0)
		{
			r=a%10;
			if(r<=1){}
			else
			{
				b=false;
			}
			a=a/10;
		}
		if(b)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		n.close();
	}
}