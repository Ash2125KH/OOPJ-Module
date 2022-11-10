import java.util.Scanner;

class Q_04{
	static float si(float amt, float rt, int t)
	{
		
		return (amt*rt*t)/100;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Principle amount");
		float amt=sc.nextFloat();
		System.out.println("Enter a rate of interest");
		float rt=sc.nextFloat();
		System.out.println("Enetr a Years");
		int t=sc.nextInt();
		System.out.println("Simple interest is: "+si(amt,rt,t));
	}
}