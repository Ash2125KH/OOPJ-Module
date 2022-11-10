import java.util.Scanner;

class Q_02
{
	static float area(int r)
	
	{
		return 3.14f*r*r;
	}
	
	static float circumference(int r)
	
	{
		return 3.14f*r*2;
	}
	
public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a redius of circle");
		int r=sc.nextInt();
		System.out.println("Area of circle is: "+area(r));
		System.out.println("Circumference of the circle is: "+circumference(r));
	}
}