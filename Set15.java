package Guvi;
import java.util.Scanner;
public class Set15 {
	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		System.out.println("Enter the range");
		int m=a.nextInt();
		int n=a.nextInt();
		for (int i=m+1;i<n;i++)
		{
			if(i%2==0) 
				
			{
				System.out.print(i + " ");
			}
		}
		a.close();
	}

}
