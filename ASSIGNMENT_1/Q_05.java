import java.util.Scanner;

class Q_05{
	static int year(int days)
	
	{
		return days/365;
	}
	
	static int month(int days)
	
	{	
		return days%365/30;
	}
	
	static int days(int days)
	
	{
		return days%365%30;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Day's");
		int days=sc.nextInt();
		System.out.print("Total Year's: "+year(days));
		System.out.print(", Total Month's: "+month(days));
		System.out.print(", Toatal Day's: "+days(days));
	}
}