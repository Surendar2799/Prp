package Guvi;
import java.util.Scanner;
public class Minutes_hours {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the minutes");
		int n=s.nextInt();
		int r=0;
		if(n>60)
		{
			r=n/60;
			n=n%60;
			System.out.println(r+ " "+n);
		}
		else
			System.out.println(r+ " "+n);
		s.close();	
	}
}