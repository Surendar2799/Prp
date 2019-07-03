package Guvi;
import java.util.Scanner;
public class Prime_Intervals {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the Range");
		int a=n.nextInt();
		int b=n.nextInt();
		for(int i=a;i<b;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
					break;
			}
		}
		n.close();
	}
}