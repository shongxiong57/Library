

public class Library {

	public Book first;
	public Book last;
	
	public Library(){
		first = null;
		last = null;
	}
	
	//Insert Link to LinkedList
	public void insertBook(String name, int pages){
		if(first == null){
			first = new Book(name,pages);
			last = first;
		}
		else {
			last.next = new Book(name,pages);
		}
	}
	
	//If empty, return true
	public boolean isEmpty(){
		return (first == null);
	}
}

