package Guvi;

import java.util.Scanner;

public class Count_Numaric {

	public static void main(String[] args) {
		System.out.println("Enter the values");
		Scanner s=new Scanner (System.in);
		String a=s.nextLine();
		char c[]=a.toCharArray();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(c[i])) {
				count++;
			}
		}
		System.out.println(count);
		s.close();
		}
	}