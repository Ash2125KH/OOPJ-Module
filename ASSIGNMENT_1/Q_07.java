import java.util.Scanner;

class Q_07
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  two numbers");
		System.out.print("a = ");
		int a=sc.nextInt();
		System.out.print("b = ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.print("b = "+b);
	}
}