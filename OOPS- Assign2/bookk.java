package Assign_2;

class Book{
	
	private String Title;
	private String Author;
	private String publisher;
	private String ISBN;
	private int year;
	private double price;
	private int quantity;
	
	public Book() {
		this.Title="World of know";
		this.Author="AMey More";
		this.publisher="Cdac Mumabi";
		this.ISBN="23234Ambc";
		this.year=1990;
		this.price=1200;
		this.quantity=1000;
	}
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Book(String title, String author, String publisher, String iSBN, int year, double price, int quantity) {
		super();
		Title = title;
		Author = author;
		this.publisher = publisher;
		ISBN = iSBN;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void increaseQuantity(int quantity ) {
		
		this.quantity = this.quantity + quantity;
		
	}
	public void decreaseQuantity(int quantity) {
		
		this.quantity = this.quantity - quantity;
	}

	public int  getInventoryValue() {
		//int productPrince =100;
		
		int finalPrice = 100 * this.quantity;
		return finalPrice;
	
	}


	
	
}
public class bookk {
   public static void main(String[] args) {
	   Book value=new Book();
	   System.out.println(value.getQuantity());
	   value.increaseQuantity(200);
	   System.out.println(value.getQuantity());
	   System.out.println(value.getQuantity());
	   value.decreaseQuantity(240);
	   System.out.println(value.getQuantity());
	   System.out.println("Final Price is "+value.getInventoryValue());

      
   }
   
}

