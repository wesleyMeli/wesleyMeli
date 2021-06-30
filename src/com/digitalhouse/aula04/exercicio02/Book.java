/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class Book {
	
	private String title;
	private String isbn;
	private String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Book book) {
		super();
		this.title = book.title;
		this.isbn = book.isbn;
		this.author = book.author;
	}
	
	public Book(String title, String isbn, String author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void emprestimo() {
		
	}
	
	public void devolver() {
		
	}

	/**
	 * toString em letras minúsculas a ide solicita a remocão do @Override
	 */
	@Override
	public String toString() {
		return title +", "+ isbn +", "+ author;
	}
	
	

}
