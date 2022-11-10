class Box{
	double height;
	double width;
	double breadth;
	Box(){}
	Box(double height, double width, double breadth){this.height=height;this.width=width;this.breadth=breadth;}
	double getVolume(){
		return (height*width*breadth);
	}
	double getArea(){
		return (2*height*width+2*height*breadth+2*width*breadth);
	}
}

class Que_6{
	public static void main(String[] args)
	{
		Box b1=new Box(11,22,31);
		System.out.println("Voleme of first box: "+b1.getVolume());
		System.out.println("Area of first box: "+b1.getArea());
		System.out.println("= = = = = = = == = = = = = = = = = =");
		Box b2=new Box(10,10,10);
		System.out.println("Voleme of first box: "+b2.getVolume());
		System.out.println("Area of first box: "+b2.getArea());	
	}
}

