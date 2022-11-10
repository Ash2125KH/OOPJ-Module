import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//class Book
class Book{
	int noOfCopy;
	String author;
	String title;
	String publisher;
	double cost;
	Scanner sc;
	Book(){
		sc=new Scanner(System.in);
	}
	Book(int noOfCopy, String author,String title,String publisher, double cost){
		this.noOfCopy=noOfCopy;
		this.author=author;
		this.title=title;
		this.publisher=publisher;
		this.cost=cost;
		sc=new Scanner(System.in);
	}
	void details(){
		System.out.println("Author of the Book: "+author);
		System.out.println("Title of the Book: "+title);
		System.out.println("Publisher of the Book: "+publisher);
		System.out.println("Cost of the Book: "+cost);
		System.out.println("=============================================");
		
		System.out.println("Enter a nuber of copy to buy");
		int n=sc.nextInt();
		if(n>noOfCopy){
			System.out.println("Sorry! No of copy not available");
			return;
		}
		this.noOfCopy=noOfCopy-n;
		System.out.println("Total bill is: "+n*cost);
		System.out.println("Thank You !! visit again.");
		
	}
}

class Bookshop{
	List<Book> list=new ArrayList<>();
	Bookshop(){}
	void addBook(int noOfCopy,String title,String author,String publisher, double cost){
		list.add(new Book(noOfCopy,author,title,publisher,cost));
	}
	void allBookDatails(String title,String author){
		for(Book b:list){
			if((b.title).equalsIgnoreCase(title) && (b.author).equalsIgnoreCase(author)){//  equalsIgnoreCase()
				b.details();
				return;
			}
		}
		System.out.println("Book Not found");
	}
}
public class Question_6{
	public static void main(String[] args){
		Bookshop bs=new Bookshop();
		bs.addBook(2,"Secreat of life","Aishwarya","Wings",120);
		bs.addBook(2,"Abh","C-DAC","Mumbai",230);
		bs.addBook(4,"Power of Habit","Charles Duhigg","New york time",350);
		bs.addBook(4,"Java","Denis richi","oracle",250.0);
		bs.addBook(3,"Wings of Fire","A.P.J.Abdul Kalam","yushodha",300);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a title of Book");
		String title=sc.nextLine();
		System.out.println("Enter a Author of Book");
		String author=sc.nextLine();
		
		bs.allBookDatails(title,author);	
	}
}
