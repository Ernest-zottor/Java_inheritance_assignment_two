
class Author{
	private String name;
	private String email;
	private char gender;

	public Author (String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public char getGender() {
		return this.gender;
	} 

	public String toString(){
		return (this.name + " (" + this.gender + ") " + "at " + this.email);
		 
	}

}


class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;

	
	public Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qtyInStock;
	}

	public String getName(){
			return this.name;
	}
	
	public Author getAuthor(){
			return this.author;
	}

	public void setPrice(double price){
			this.price = price;
	}

	public int getQty(){
			return this.qty;
	}

	public void setQty(int qty){
			this.qty = qty;
	}

	public String toString(){
		return ( name + " by " + author.toString());
		 
	}

}


public class Q1 {

	public static void main(String[] args) {
		Author author1 = new Author("Amalitech", "amalitechteam@gmail.com", 'm');
		System.out.println("Author's details are " + author1+"\n");	
		
		Book book1 = new Book("Introduction to Java", author1, 59.9, 3000);
		System.out.println(book1);

		
	}

}