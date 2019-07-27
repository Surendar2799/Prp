package prp;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the values");
		int s=n.nextInt();
		int r=0,sum=0;
		int temp=s;
		while(s>0)
		{
			r=s%10;
			sum=(sum*10)+r;
			s=s/10;
		}
		if(temp==sum)
		System.out.println("Yes");
		else
		System.out.println("No");
		n.close();
	}

}
