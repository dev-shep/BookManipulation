package BookManipulation;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> bookList = new ArrayList<>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	
	public boolean isEmpty(){
		boolean f=false;
		if(bookList.isEmpty()) {
			f=true;
		}
		return f;
	}
	
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	};
	
	public ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> al=new ArrayList<>();
		for(int a = 0;a<bookList.size();a++) {
			if(bookList.get(a).getAuthor().equalsIgnoreCase(author)) {
				al.add(bookList.get(a));
			}
		}
		return al;
	}
	
	public int countnoofbook(String bname) {
		int count=0;
		for(int a=0;a<bookList.size();a++) {
			if(bookList.get(0).getBookName().equalsIgnoreCase(bname)) {
				count++;
			}
		}
		
		return count;
	}
	
	
}
