package Guvi;
import java.util.Scanner;
public class Count_Number_spaces {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char c[] = a.toCharArray();
		int count = 0;
		for(int i = 0; i < a.length(); i++)
		{
			if(Character.isSpaceChar(c[i])) {
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
	}