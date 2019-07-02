package prp;
import java.util.Scanner;
public class Largest_Number {
	public static void main(String[] args) {
	    System.out.println("Enter three integers");
	    Scanner n = new Scanner(System.in);
	 
	    int x=n.nextInt();
	    int y=n.nextInt();
	    int z=n.nextInt();
	 
	    if (x > y && x > z)
	      System.out.println(x);
	    else if (y > x && y > z)
	      System.out.println(y);
	    else 
	      System.out.println(z);
	    n.close();
	}
}
