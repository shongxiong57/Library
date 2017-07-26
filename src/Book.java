
public class Book {
	
	public String bookName;
	public int bookPage;
	
	//Contains address of the next Link
	public Book next;
	
	//Constructor
	public Book(String name, int pages) {
		bookName = name;
		bookPage = pages;
		next = null;
	}
	//Displays information in Link
	public void display() {
		System.out.println("The following book has been added...");
		System.out.println("Book: " + bookName + "\n" + "Pages: " + bookPage);
	}
	
}



