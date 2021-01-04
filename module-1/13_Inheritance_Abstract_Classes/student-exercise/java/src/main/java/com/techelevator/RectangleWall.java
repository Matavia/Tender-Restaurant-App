package com.techelevator;

public class RectangleWall extends Wall {
	
	private int length;
	private int height;
	
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
}
	
	public int getLength() {
		return length;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public int getArea(){
		int area = this.length * this.height;
		return area;
	}
	
	@Override
	public String toString() {
		String output = getName() +" (" + length + "x" + height + ") rectangle";
		return output;
	}

	
}
