package Rough;
import java.util.Scanner;
public class Nearest_2 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int m=0;
		int temp=0;
		while(true)
		{
			temp=(int)Math.pow(2,m);
			if(a+1<=temp)
			{
				break;
			}
			m+=1;
		}
		System.out.println(temp);
		n.close();
	}
}