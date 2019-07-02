import java.util.Scanner;
public class Natural_No {
	public static void main(String[] args) {
		System.out.println("Enter the terms");
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		a.close();
	}
}