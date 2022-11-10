class Author{
	private String name;
	private String email;
	private char gender;
	Author(){}
	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getName(){
		return name;
	}
	char getGender(){
		return gender;
	}
	String getEmail(){
		return email;
	}
}
class Book1{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book1(){}
	Book1(String name, double price, int qtyInStock, String aname, String email, char gender){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		author=new Author(aname,email,gender);
	}/*
	void authorDetail(){
		System.out.println("Author name is: "+author.getName());
		System.out.println("Author email is: "+author.getEmail());
		System.out.println("Author gender is: "+author.getGender());
	}*/
	String getBookName(){
		return name;
	}
	double getBookPrice(){
		return price;
	}
	int getQtyInStock(){
		return qtyInStock;
	}
	String getAuthor(){
		return author.getName();
	}
	void setPrice(double price){
		this.price=price;
	}
	void setQtyInStock(int n){
		qtyInStock=n;
	}
}
public class Question_7{
	public static void main(String[] args){
		Book1 b1=new Book1("Power of Habit", 200.0, 3, "Staline", "staline12@gmail.com",'M');
		System.out.println("Name of Book is: "+b1.getBookName());
		System.out.println("Price of Book is: "+b1.getBookPrice());
		System.out.println("Total quantity of book: "+b1.getQtyInStock());
		System.out.println("Author Name is: "+b1.getAuthor());
		b1.setPrice(400.50);
		System.out.println("After setting price. Price is: "+b1.getBookPrice());
		b1.setQtyInStock(10);
		System.out.println("After setting Quantity. Quantity is: "+b1.getQtyInStock());
	}
}
