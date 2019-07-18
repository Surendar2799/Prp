package Guvi;
import java.util.Scanner;
public class Special_char_count {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char c[] = a.toCharArray();
		int count=0;
		int count1=0;
		for(int i=0;i<c.length;i++)
		{
			if((c[i]>=65&&c[i]<=90)||(c[i]>=97&&c[i]<=122)||(c[i]>=48&&c[i]<=57))
			{
				
			}
			else if(c[i]==' ')
			{
				count++;
			}
			else
				count1++;
		}
		System.out.println(count1);
		s.close();
	}
}