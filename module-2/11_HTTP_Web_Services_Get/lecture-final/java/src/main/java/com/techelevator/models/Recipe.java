package com.techelevator.models;

public class Recipe {
	
	private String label;



public Recipe(String nameOfRecipe){
	this.label = nameOfRecipe;
	
}

public String getNameOfRecipe() {
	return label;
}

public void setNameOfRecipe(String nameOfRecipe) {
	this.label = nameOfRecipe;
}
}