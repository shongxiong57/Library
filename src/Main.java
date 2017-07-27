import java.util.Scanner;

public class Main {
	private static Scanner input;

	public static void main(String[] args){
		
		Library books = new Library();
		String mybook;
		int numPages;
		boolean AddingBook = true;
		boolean exit = false;
		
		input = new Scanner(System.in);
		
		while(!exit){

			System.out.println("Pick an option below: \n");
			System.out.println("1: Add book \n"
					+ "2: Delete book \n" 
					+ "3: Sort books alphabetically \n"
					+ "4: Print list of books \n"
					+ "Exit: Exit Library \n");		
			
			String addbook = input.next();
			if(addbook.equals("1")){
				while(AddingBook){
				//Adds a book to the Library
					System.out.println("Do you want to add a book? Type Yes or No.");
					addbook = input.next();
					if (addbook.equals("Yes")){
						System.out.println("Enter the name of the book. DO NOT USE SPACES!");
						mybook = input.next();
						System.out.println("Enter the total number of pages in the book.");
						numPages = input.nextInt();
						books.insertBook(mybook, numPages);
						books.last.display();
						AddingBook = true;
					}
					else if (addbook.equals("No")){
						System.out.println("You are done adding books to the Library.");
						AddingBook = false;
					}
					else {
						System.out.println("Invalid input.");
					}
				}
			}
			else if(addbook.equals("2")){
				//Delete book
			}
			else if(addbook.equals("3")){
				//Sort Library Alpha
			}
			else if(addbook.equals("Exit")){
				System.out.println("Exiting Library. Goodbye.");
				exit = true;
			}
		
		}
		
		input.close();
	}
}
