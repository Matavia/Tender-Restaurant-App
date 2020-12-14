package com.techelevator;


//class declaration
public class Elevator {
	
	//constant variable
	
	//instance variable
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

	
	//getters/setters
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	//derivative getter
	
	//constructors
	
	public Elevator(int numberOfLevels) {
		numberOfFloors = numberOfLevels;
		currentFloor = 1;
	}
	
	//methods
	public void openDoor() {
		doorOpen = true;
	}
	
    public void closeDoor() {
    	doorOpen = false;
    }
    public void goUp(int desiredFloor) {
    	if((!doorOpen && desiredFloor <= numberOfFloors) && desiredFloor > currentFloor ) {
    		currentFloor = desiredFloor;
     	}
    	
    }
    public void goDown(int desiredFloor) {
     	if((!doorOpen && desiredFloor < currentFloor) && desiredFloor > 0) {
    		currentFloor = desiredFloor;
     	}
    	
    }
    	
    }


