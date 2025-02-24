package com.wipro.microservices.l;


	public class Test {

	    static void getAreaTest(Shape shape) {
	        if (shape instanceof Rectangle) {
	            Rectangle rectangle = (Rectangle) shape;
	            int width = rectangle.getWidth();
	            rectangle.setHeight(10);
	            System.out.println("Expected area of " + (width * 10) + ", got " + rectangle.getArea());
	        } else if (shape instanceof Square) {
	            Square square = (Square) shape;
	            int side = square.getSide();
	            square.setSide(10);
	            System.out.println("Expected area of " + (side * 10) + ", got " + square.getArea());
	        }
	    }

	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(2, 3);
	        getAreaTest(rectangle);

	        Square square = new Square(5);
	        getAreaTest(square);
	    }
	}

