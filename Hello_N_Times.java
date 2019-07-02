import java.util.Scanner;
public class Hello_N_Times {
	public static void main(String[] args) {
		System.out.println("Enter the terms");
		Scanner n=new Scanner (System.in);
		int a=n.nextInt();	
		for(int i=0;i<a;i++)
		{
			System.out.println("Hello");
		}
		n.close();
		}
}