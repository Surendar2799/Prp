package Guvi;
import java.util.Scanner;
public class Count_Line {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char c[] = a.toCharArray();
		int len = c.length;
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				count++;
			}
		}
		System.out.println(len-count);
		s.close();
	}
}