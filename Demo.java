package CH6_Homework;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// book1///
		Book book1 = new Book("Don't make me think ","Steve Krun",2000);
		book1.isBorrowed = true;
		////book2///
		System.out.println(book1.toString());
		Book book2 = new Book("JavaProgramming","Terril",2005);
		System.out.println(book2.toString());
		///book3///
		Book book3 = new Book("Programming in Python 3 ","Mark Summerfield",2005);
		book3.isBorrowed = true;
		System.out.println(book3.toString());
		////book4////
		Book book4 = new Book("The Clean Coder ","Robert",2011);
		book4.isBorrowed = true;
		System.out.println(book4);
		////book5////
		Book book5 = new Book("The Art of Agile Development ","James Shore",2007);
		System.out.println(book5);
		///book6////
		Book book6 = new Book("Head First Desing Patterns ","Eric Freeman",2004);
		System.out.println(book6);
		///book7////
		Book book7 = new Book("The Linux Command line ","William",2009);
		book7.isBorrowed = true;
		System.out.println(book7);
		///book8////
		Book book8 = new Book("Code Complete ","Steav",1993);
		System.out.println(book8);
		////book9/////
		Book book9 = new Book("Unit Test Pattern ","Gerard Meszaros",2003);
		System.out.println(book9);
		////book10////
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book10.isBorrowed = true;
		System.out.println(book10);
		
		List<Book> books = new ArrayList<>();
		books.add(new Book ("Don't make me think ","Steve Krun",2000));
		books.add(new Book ("JavaProgramming","Terril",2005));
		books.add(new Book ("Programming in Python 3 ","Mark Summerfield",2005));
		books.add(new Book ("The Clean Coder ","Robert",2011));
		books.add(new Book ("The Art of Agile Development ","James Shore",2007));
		books.add(new Book ("Head First Desing Patterns ","Eric Freeman",2004));
		books.add(new Book ("The Linux Command line ","William",2009));
		books.add(new Book ("Code Complete ","Steav",1993));
		books.add(new Book ("Unit Test Pattern ","Gerard Meszaros",2003));
		books.add(new Book ("The C++ Programming Language","Bjarne Stroustup",2013));
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%1$-30s %2$-20s %3$-20s %4$-20s","TITLE","AUTOR","YEAR","STATUS");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		for( Book Book: books) {
			System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
					Book.getTitle(),Book.autor,Book.getPublishYear(),Book.getBorrowed());
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}

}
