package Guvi;
import java.util.Scanner;
public class Compare_Two_String {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b[]=a.split(" ");
	    if(b[0].length()<=b[1].length())
	    {
	    	System.out.println(b[1]);
	    }
	    else
	    	System.out.println(b[0]);
	    s.close();
	}
}