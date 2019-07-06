package prp;
import java.util.Scanner;
public class Sorting_Array {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=n.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the Array values");
		int temp=0;
		for(int i=0;i<s;i++)
		{
			a[i]=n.nextInt();
		}
		for(int j=0;j<s;j++)
		{
			for(int k=j+1;k<s;k++)
			{
			if(a[j]>a[k])
			{
				temp=a[j];
			    a[j]=a[k];
			    a[k]=temp;
			}
		}
		}
		for(int i=0;i<s;i++)
			System.out.println(a[i]);
     n.close();
	}
}
