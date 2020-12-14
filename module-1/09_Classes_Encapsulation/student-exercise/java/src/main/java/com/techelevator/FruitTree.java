package com.techelevator;

//class declaration
public class FruitTree {
	
	//constant variables
	
	//instance variables
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	//getter/setter
	public String getTypeOfFruit() {
	return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	//getter derivatives
	
	//constructs
	public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = piecesOfFruitLeft;
		
	}
	
	//methods
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if( piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
