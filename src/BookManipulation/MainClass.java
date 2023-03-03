/**
 * 
 */
package BookManipulation;

import java.util.Scanner;

/**
 * @author KSOLIS
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		
		while(i==0) {
			System.out.println("1.Add Book");
			System.out.println("2.ADisplay all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Count number of book");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				Book    bk  =new Book();
				Library lib = new Library();
				System.out.println("Enter the isbn no");
				int isbn = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the book name");
				String name = sc.nextLine();
				System.out.println("Enter the author name");
				String author = sc.nextLine();
				bk.setIsbno(isbn);
				bk.setBookName(name);
				bk.setAuthor(author);
				lib.addBook(bk);
				
			}else if(choice == 2){
				Library lib = new Library();
				System.out.println("Enter the author name:");
				String atr=sc.nextLine();
				for(Book b: lib.viewBooksByAuthor(atr)) {
					System.out.print("ISBN no:   "+b.getIsbno());
					System.out.print("Book Name: "+b.getBookName());
					System.out.print("ISBN no:   "+b.getAuthor());
				}
			}else if(choice == 3) {
				Library lib = new Library();
				System.out.println("Enter the book name:");
				String bookNm = sc.nextLine();
				int c = lib.countnoofbook(bookNm);
				System.out.print(c);
			}else if(choice == 5) {
				break;
			}
			
		}
	}

}
