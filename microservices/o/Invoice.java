package com.wipro.microservices.o;



	public class Invoice implements BookPersistence {
	    private Book book;
	    private int quantity;
	    private int totalCost;

	    public Invoice(Book book, int quantity) {
	        this.book = book;
	        this.quantity = quantity;
	        this.totalCost = book.price * quantity;
	    }

	    public void printInvoice() {
	        System.out.println("Book: " + book.name);
	        System.out.println("Year: " + book.year);
	        System.out.println("Price per book: " + book.price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Cost: " + totalCost);
	    }

	    @Override
	    public void save(Invoice invoice) {
	        System.out.println("Invoice saved for book: " + invoice.book.name);
	    }

	    public static void main(String[] args) {
	        Book book = new Book("Java Programming", 2001, 1000);
	        Invoice invoice = new Invoice(book, 2);
	        invoice.printInvoice();
	        invoice.save(invoice);
	    }
	}

