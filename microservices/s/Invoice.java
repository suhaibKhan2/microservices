package com.wipro.microservices.s;

public class Invoice {
 Book book;
 int quantity;
 double discountRate;
 double taxRate;
 double total;
 
 public Invoice(Book book, int quantity, double discountRate, double taxRate, double total) {
	 this.book = book;
	 this.quantity = quantity;
	 this.discountRate = discountRate;
	 this.taxRate = taxRate;
	 this.total = this.calculatTotal();
 }
 public double calculatTotal() {
	 
	 double price = ((book.price - book.price* discountRate) * this.quantity);
 double priceWithTaxes = price * (1 + taxRate);
 return priceWithTaxes;
 }
 public void printInvoice() {
	 System.out.println(quantity + "x "+ book.name + " " + book.price + " "+ book.price + "$" );
 System.out.println("Discount Rate: "+ discountRate);
 System.out.println("Tax Rate: "+ taxRate);
 System.out.println("Total: "+ total);
 }
 public void saveToFile(String filename) {
	 
 }  
}
