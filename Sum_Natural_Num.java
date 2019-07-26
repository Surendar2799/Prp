package Guvi;
import java.util.Scanner;
public class Sum_Natural_Num {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int sum=0,i=0;;
		while(i<=a)
        {
            sum = sum +i;
            i++;
        }
		System.out.println(sum);
		n.close();
	}
}