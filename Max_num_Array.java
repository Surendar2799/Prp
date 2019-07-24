package prp;
import java.util.*;
public class Max_num_Array {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=n.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the Array values");
		int max=0;
		int min=s;
		for(int i=0;i<s;i++)
		{
			a[i]=n.nextInt();
		}
		for(int j=0;j<s;j++)
		{
			if(a[j]>max)
				max=a[j];
		}
		System.out.println("Tne Highest number is "+max);
		for(int k=0;k<s;k++)
		{
			if(a[k]<min)
				min=a[k];
		}
		System.out.println("Tne Lowest number is "+min);
		n.close();
	}
}
