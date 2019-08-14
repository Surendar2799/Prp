package Rough;
import java.util.Scanner;
public class Nearest_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(true)
		{
			if(n%10==0)
			{
				break;
			}
			n+=1;
		}
		System.out.println(n);
	}
}