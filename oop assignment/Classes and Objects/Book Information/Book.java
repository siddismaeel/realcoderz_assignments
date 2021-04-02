import java.util.Scanner;
class Book
{
	private String title;
	private String author;
	private double cost;
	private int noOfBooks;
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public void setCost(double cost)
	{
		this.cost= cost;
	}
	public double getCost()
	{
		return this.cost;
	}
	public void setNoOfBooks(int noOfBooks)
	{
		this.noOfBooks = noOfBooks;
	}
	public int getNoOfBooks()
	{
		return this.noOfBooks;
	}
	public void displayBook()
	{
		System.out.println("Book Title: " + this.title);
		System.out.println("Book Author: " + this.author);
		System.out.println("Book Cost: " + this.cost);
		System.out.println("Number of Available Bokks: " + this.noOfBooks);
	}
	
	static Book checkBookAvailability(String bookTitle, int noOfRequiredBooks, Book[] books)
	{
		for(Book book: books)
		{
			if(bookTitle.equalsIgnoreCase(book.getTitle()) && noOfRequiredBooks <= book.getNoOfBooks())
			{
				return book;
			}
			else
			{
				return null;
			}
		}
		
		return null;
	}
	
	public static void printCost(Book book, int noOfBooks)
	{
		System.out.println("The total cost of books is: " + (book.getCost() * noOfBooks));
	}
}

class TestBook
{
	public static void main(String[] args)
	{
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		initializeBook(book1);
		initializeBook(book2);
		initializeBook(book3);
		
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the book title:");
		String bookTitle = sc.next();
		
		System.out.println("How many number of books you want:");
		int noOfBooks = sc.nextInt();
		Book existedBook = Book.checkBookAvailability(bookTitle, noOfBooks, new Book[]{book1, book2, book3});
		if(existedBook != null)
		{
			Book.printCost(existedBook, noOfBooks);
		}
		else
		{
			System.out.println("Book does not exist");
		}
	}
	
	public static void initializeBook(Book book)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Title: ");
		book.setTitle(sc.next());
		
		System.out.println("Enter Book Author: ");
		book.setAuthor(sc.next());
		
		System.out.println("Enter Book Cost: ");
		book.setCost(sc.nextDouble());
		
		System.out.println("Enter Number of Books: ");
		book.setNoOfBooks(sc.nextInt());
		
		
	}
}