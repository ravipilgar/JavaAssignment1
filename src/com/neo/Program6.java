package com.neo;


class Shape{
	
	void area() {
		System.out.println("Calculating shape.");
	}
	
	void draw() {
		System.out.println("Drawing  shape.");
	}
}

class Circle extends Shape{
	
	void area() {
		System.out.println("Calculating of circle....");
	}
	
	void draw() {
		System.out.println("Drawing cricle.");
	}
}

class Square extends Shape{
	
	void area() {
		System.out.println("Calculating of square..");
	}
	
	void draw() {
		System.out.println("Drawing square....");
	}
}

class Triangle extends Shape{
	
	void area() {
		System.out.println("Calculating triangle.");
	}
	
	void draw() {
		System.out.println("Drawing triangle....");
	}
}

public class Program6 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		Shape c = new Circle();
		Shape s = new Square();
		Shape t = new Triangle();
		
		shape.area();
		shape.draw();
		c.area();
		c.draw();
		s.area();
		s.draw();
		t.area();
		t.draw();
		
	}

}
