import java.util.*;
public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number:");
		int Num=sc.nextInt();
		int count=0;
		while(Num>0)
		{
			Num = Num/10;
			count = count + 1; 
		}
		System.out.println(count);
		sc.close();
	}
}