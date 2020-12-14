package com.techelevator;


public class Airplane {
	

	private String planeNumber;
	private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	
	
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		return availableFirstClassSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		return availableCoachSeats;
	}
	
	
	
	
	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	

	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass) {
			
			bookedFirstClassSeats += totalNumberOfSeats;
			boolean enoughSeats = getAvailableFirstClassSeats() >= 0;
			return enoughSeats;
			}
		
		else {
			bookedCoachSeats += totalNumberOfSeats;
			boolean enoughSeats = getAvailableCoachSeats() >= 0;
			return enoughSeats;
		}
	}
	
	

}
