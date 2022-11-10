import java.util.Scanner;

class Q_08
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a basic salary of employee");
		double gs=0;
		double basicSalary=sc.nextInt();
		
		if(basicSalary<10000)
		{
			gs=basicSalary+basicSalary*90/100+basicSalary*10/100;
		}
		
		else
		{
			gs=basicSalary+2000+basicSalary*98/100;
		}
		
		System.out.println("Gross salary: "+gs);
	}
}