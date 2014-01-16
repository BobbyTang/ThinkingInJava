package com.github.bobby.base;

//: polymorphism/PolyConstructors.java 
//Constructors and polymorphism 
//don��t produce what you might expect. 
import static net.mindview.util.Print.*;

class Glyph {

	private static String baseStr = "static String field";
	
	static {
		System.out.println("baseStr = " + baseStr);
		System.out.println("Glyph.enclosing_method(static)");
	}
	
	{
		System.out.println("Glyph.enclosing_method(noraml)");
	}
	
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
	
	void draw() {
		print("Glyph.draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	private Glyph glyph = new Glyph();

	static {
		System.out.println("RoundGlyph.enclosing_method(static)");
	}
	
	{
		System.out.println("RoundGlyph.enclosing_method(noraml)");
		System.out.println(" radius =  " + radius);
		System.out.println("new glyph() = " + glyph);
	}
	
	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}






