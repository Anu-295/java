
public class Book {
	 String author;int pages;BookName add;
	public Book(BookName add,String author,int pages)
	{
	this.author=author;
	this.pages=pages;
	this.add=add;
	}
public void display()
{
	System.out.println("name of book: "+add.bookname);
	System.out.println("published year: "+add.publishedyear);
	System.out.println("author of book: "+author);
	System.out.println("number of pages: "+pages);
}
	public static void main(String[] args) {
		BookName obj1=new BookName("Two States",2010);
		Book obj2=new Book(obj1,"Chetan Bhagath",235);
		obj2.display();
		

	}

}
