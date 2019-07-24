package Guvi;
import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String a[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		int index=s.nextInt();
		System.out.println(a[index]);
		s.close();
	}
}
