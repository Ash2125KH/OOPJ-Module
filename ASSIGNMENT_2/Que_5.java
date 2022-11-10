class Student{
	String name;
	Student (String name){ this.name=name;}
	int math;
	int science;
	int marathi;
	void marks(int marathi, int science, int math){
		this.marathi=marathi;
		this.math=math;
		this.science=science;
	}
	double average(){
		return ((marathi+math+science)/3);
	}
	void display(){
		System.out.println("Name of the student is: "+name);
		System.out.println("Total marks student achieve : "+(marathi+math+science));
	}
}
public class Que_5{
	public static void main(String[] args){
		Student s1=new Student("Aishwarya");
		s1.marks(90,81,100);
		Student s2=new Student("Mayur");
		s2.marks(70,57,66);
		s1.display();
		System.out.println("Average Marks are: "+s1.average());
		System.out.println("\n== == == == == == == == == == ==\n");
		s2.display();
		System.out.println("Average Marks are: "+s2.average());
	}
}

