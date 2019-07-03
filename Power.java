import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number the values");
		System.out.println("Enter the power");
		int n=s.nextInt();
		int m=s.nextInt();
		int power=(int) Math.pow(n, m);
		System.out.println(power);
		s.close();			
	}
}