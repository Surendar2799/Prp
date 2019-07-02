import java.util.Scanner;
public class NK_Guvi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		System.out.println("Enter the number");
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}