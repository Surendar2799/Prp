package Guvi;
import java.util.Scanner;
public class Count_Digit {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		System.out.println(count);
		n.close();
	}
}