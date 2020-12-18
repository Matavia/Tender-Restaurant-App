package com.techelevator;

public class TriangleWall extends Wall {
	
	private int base;
	private int height;
	
	
	public TriangleWall(String name, String color, int base, int height) {
		super( name, color);
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}

	@Override
	public int getArea() {
		double doubleArea = (base * height) / 2;
		int intArea = (int)doubleArea;
		return intArea;
	}
	
	@Override 
	public String toString() {
		String output = getName() + " (" + base + "x" + height + ") " + "triangle";
		return output;
	}

}
