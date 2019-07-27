package Guvi;
import java.util.Scanner;
public class Min_10 {
	public static void main(String[] args) {
		Scanner m=new Scanner (System.in);
		int a[]=new int[10];
		int min=10;
		for(int i=0;i<10;i++)
		{
			a[i]=m.nextInt();
		}
		for(int j=0;j<10;j++)
		{
			if(a[j]<min)
				min=a[j];
		}
		System.out.println(min);
		m.close();

	}

}
