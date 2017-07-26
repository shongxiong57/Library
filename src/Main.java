import java.util.Scanner;

public class Main {
	private static Scanner input;

	public static void main(String[] args){
		
		Library books = new Library();
		String mybook;
		int numPages;
		
		input = new Scanner(System.in);
		
		System.out.println("Do you want to add a book? Type Yes or No.");
		String addbook = input.next();
		
		//Adds a book to the Library
		if (addbook.equals("Yes")){
			System.out.println("Enter the name of the book. DO NOT USE SPACES!");
			mybook = input.next();
			System.out.println("Enter the total number of pages in the book.");
			numPages = input.nextInt();
			books.insertBook(mybook, numPages);
			books.last.display();
		}
		else if (addbook.equals("No")){
			System.out.println("You are exiting the Library. Goodbye.");
		}
		else {
			System.out.println("Invalid input");
		}
		
		input.close();
		
	}
}
