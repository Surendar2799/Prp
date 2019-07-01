package Wipro;

import java.util.Scanner;
public class Wipro5 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the values");
		char a=n.next().charAt(0);
		if((int)a>=65 && (int)a<=90||(int)a>=97 && (int)a<=122)
			{
			System.out.println("Alphabet" );
			}
		else if((int)a>=48 && (int)a<=57)
			
			{
			System.out.println("Digit");
			}
		else
			{
			System.out.println("Special Character");
			}
		n.close();
	}
}
