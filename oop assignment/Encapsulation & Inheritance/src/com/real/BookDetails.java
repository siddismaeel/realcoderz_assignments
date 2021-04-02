package com.real;

import java.util.Scanner;

import com.real.api.Book;
import com.real.api.EngineeringBook;

public class BookDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EngineeringBook book = new EngineeringBook();
		 System.out.println("Enter Book number");
		int booNo = sc.nextInt();

		System.out.println("Enter Book title");
		String booTitle = sc.next();
		
		System.out.println("Enter Book author");
		String author = sc.next();
		
		System.out.println("Enter Book price");
		float price = sc.nextFloat();
		
		System.out.println("Enter Book category");
		String bookCat = sc.next();
		book.setBookNo(booNo);
		book.setTitle(booTitle);
		book.setAuthor(author);
		book.setPrice(price);
		book.setCategory(bookCat);
		
		showBook(book);
		
		
		
		
	}
	
	public static void showBook(EngineeringBook book)
	{
		System.out.println("Book number: " + book.getBookNo());
		System.out.println("Book title: " + book.getTitle());
		System.out.println("Book author: " + book.getAuthor());
		System.out.println("Book category: " + book.getCategory());
		System.out.println("Book price: " + book.getPrice());
	}

}
