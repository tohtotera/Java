package practice;

import java.util.Date;

public class Book{
	private String title;
	private Date   publishDate;
	private String comment;

	//コンストラクタ
	Book(String title, Date publishDate, String comment){
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	public String getTitle(){
		return this.title;
	}

	public Date getPublishDate(){
		return this.publishDate;
	}

	public String getComment(){
		return this.comment;
	}
/*
	Map<Date, String> bookManagement = new HashMap<Date, String>();
	Iterator<Date> it = bookManagement.keySet().iterator();

	public int hashCode(){
		int r = 1;

		r = 31 * r + publishDate.hashCode();
		r = 31 * r + title.hashCode();
		return r;
	}

	public boolean equals(String bookTitle, Date bookDate){
		while (it.hasNext()){
			if (it.next().equals(bookDate)){
				System.out.println("書籍名：" + bookManagement.get(bookTitle));
				return true;
			}
		}
		return false;
	}

	public int compareTo(Book book){
		return this.publishDate.compareTo(book.publishDate);
	}


	public Book clone(){
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date) this.publishDate.clone();
		return b;
	}
*/

}
