package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Median_Sort {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the array size");
		Integer m=s.nextInt();
		System.out.println("Enter the values");
        Integer a[]=new Integer [m];
        for(int i=0;i<m;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int r=a.length/2;
        System.out.println(a[r]);
        s.close();
	}
}