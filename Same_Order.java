package Guvi;
import java.util.Scanner;
public class Same_Order {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String c="";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
//			System.out.print(b[i]+" ");
			c=c+" "+b[i];
		}
		System.out.println(c);
		s.close();
	}
}