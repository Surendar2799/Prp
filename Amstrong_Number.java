package prp;
import java.util.Scanner;
public class Amstrong_Number {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner (System.in);
		int a=s.nextInt();
		int b=0,count=0,r=0,d=0;
		int p=a;
		int f=a;
		while(p>0)
		{
			count=count+1;
			p=p/10;
		}
		while(a>0)
		{
			r=a%10;
			b=(int) Math.pow(r, count);
			a=a/10;
			d=d+b;
		}
		if(f==d)
			System.out.println("Given number is a amstrong number");
		else
			System.out.println("Given number is not a amstrong number");
		s.close();	
			
	}

}
