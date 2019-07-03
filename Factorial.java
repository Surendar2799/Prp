package prp;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the values");
	int b=a.nextInt();
	int fact=1;
	for(int i=1;i<=b;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial of " +b+ " is = "+fact);
	a.close();
	}

}
