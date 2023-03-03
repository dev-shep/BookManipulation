package BookManipulation;

public class Book {
	private int isbno;
	private String bookName;
	private String author;
	
	public int getIsbno() {
		return isbno;
	}
	public void setIsbno(int isbno) {
		this.isbno = isbno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [isbno=" + isbno + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
}
