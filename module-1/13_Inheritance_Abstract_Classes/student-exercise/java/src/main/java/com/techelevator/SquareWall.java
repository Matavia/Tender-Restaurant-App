package com.techelevator;

public class SquareWall extends RectangleWall {

	
	private int sideLength;
	
	

	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		this.sideLength = sideLength;
		
	}
	
	public int getSideLength() {
		return sideLength;
	}
	
	@Override
	public int getArea() {
		int area = sideLength * sideLength;
		return area;
		
	}

	
	@Override
	public String toString() {
		String output = getName() + " (" + sideLength + "x" + sideLength + ") " + "square";
		return output;
	}
	

}
