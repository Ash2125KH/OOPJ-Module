class Room{
	double height;
	double breadth;
	double width;
	Room(){}
	Room(double height, double breadth, double width){this.height=height;this.breadth=breadth;this.width=width;}
	void volume(){
		System.out.println("Volume of Room is: "+height*breadth*width+" m3");
	}
}
class RoomDemo{
	
	static void callValume(){
		Room r=new Room(10,10,10);
		r.volume();
	}
}

public class Que_4
{
	public static void main(String[] args)
	{
	
		RoomDemo.callValume();
		
	}
}
