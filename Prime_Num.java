package Guvi;
import java.util.Scanner;
public class Prime_Num {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int s=n.nextInt();
		boolean b=true;
		for(int i=2;i<s;i++)
			if(s%i==0)
			{
				b=false;
			    break;
			}
		if(b)
			System.out.println("yes");
		else
			System.out.println("No");
		n.close();
	}
}