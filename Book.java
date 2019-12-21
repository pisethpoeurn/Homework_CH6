package CH6_Homework;

public class Book {
	String title ;
	String autor;
	int publishYear ;
	boolean isBorrowed = false;
	
	
	Book (String title , String autor ,int publishYear){
		this.title = title;
		this.autor = autor;
		this.publishYear = publishYear;
	}
	public void borrow() {
		isBorrowed = true;
	}
	
	public void returnBack() {
		isBorrowed = false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPublishYear(){
		return publishYear;
	}
	 
	public boolean getBorrowed() {
		return isBorrowed;
	}
	
	public String toString () {
		String borrow;
		if(isBorrowed) {
			borrow = "Not Available to Borrow";
		}else {
			borrow = "Available to Borrow";
		}
		return "Title: " + title +"\n\t" +"by " + autor+ "--Published: "+ publishYear +"\n\t"+ "Status: "+borrow ; 
	}
}
