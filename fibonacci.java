package prp;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the terms");
		int a=0;
		int b=1;
		int s=n.nextInt();
		System.out.print(a+" "+b);
		for(int i=0;i<s;i++)
		{
			int sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		n.close();
	}

}
