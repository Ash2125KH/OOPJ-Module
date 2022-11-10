class MathOperation
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int subtract(int a, int b)
	{
		return a-b;
	}
	
	static int multiply(int a, int b)
	{
		return a*b;
	}
	
	static int power(int a, int b)
	{
		return (int)Math.pow(a,b);
	}

}
public class Que_7{
	public static void main(String[] args)
	{
		System.out.println("Sum of number 34 and 54 is: "+MathOperation.add(12,45));
		
		System.out.println("Subtraction of number 34 and 54 is: "+MathOperation.subtract(78,50));
		
		System.out.println("Multplication of number 34 and 54 is: "+MathOperation.multiply(32,41));
		
		System.out.println("Power of number 34 to 5 is: "+MathOperation.power(36,6));
	}
}
