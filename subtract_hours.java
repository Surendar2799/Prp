package Guvi;
import java.util.Scanner;
public class subtract_hours {
	public static void main(String[] args) {
		System.out.println("Enter the first hours and minutes");
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the second hours and minutes");
		int c=s.nextInt();
		int d=s.nextInt();
		int time1,time2,totaltime,min,hour,minute;
		time1=(a*60*60)+(b*60);
	    time2 = (c*60*60)+(d*60);
	    totaltime = time1-time2;
	    min = totaltime/60;
	    hour = min/60;
	    minute = min%60;
	    System.out.println(Math.abs(hour)+ " " +Math.abs(minute));
	    s.close();
	}
}