class Complex
{
	int r;
	int i;
	Complex(){}
	Complex(int r){ this.r=r; }
	Complex(int r, int i){ this.r=r; this.i=i; }
	Complex add(Complex c){
		return (new Complex((this.r+c.r),(this.i+c.i)));
	}
	Complex multiply(Complex c){
		return (new Complex( (r*c.r-i*c.i),(r*c.i+i*c.r) ));
	}
	void print(){
		System.out.println(this.r+" + "+this.i+"i");
	}	
}


public class Que_3
{
	public static void main(String[] args)
	{
		Complex c1=new Complex(7,8);
		Complex c2=new Complex(-6,5);
		Complex c3=c1.add(c2);
		System.out.println("Adition is: ");
		c3.print();
		c3=c1.multiply(c2);
		System.out.println("Multiplication is: ");
		c3.print();
	}
}

