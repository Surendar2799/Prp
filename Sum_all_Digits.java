package Guvi;
import java.util.Scanner;
public class Sum_all_Digits {
	public static void main(String[] args) {
		Scanner n=new Scanner (System.in);
		int a=n.nextInt();
		int r=0,sum=0;
		while(a>0)
		{
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println(sum);
		n.close();
	}
}