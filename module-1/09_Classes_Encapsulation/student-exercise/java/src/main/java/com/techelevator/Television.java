package com.techelevator;


//class declaration
public class Television {
	
	//constant variable
	public static final boolean defaultTvState = false; 
	public static final int defaultChannel = 3;
	public static final int defaultVolume = 2;
	//instance variable
	
	private boolean isOn;
	private int currentChannel; // channels go between 3 - 18
	private int currentVolume;
	

	

	
	//getter/setter
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	// derivative setter
	
	//constructor
	public Television() {
		isOn = defaultTvState;
		currentChannel = defaultChannel;
		currentVolume = defaultVolume;
	}
	
	//methods
	
	public void turnOff() {
		isOn = false;
	}
	
    public void turnOn() {
    	isOn = true;
		currentChannel = defaultChannel;
		currentVolume = defaultVolume;	
    }
    
    public void changeChannel(int newChannel) {
    	if(isOn && (newChannel >= 3 && newChannel <= 18)) {
    		currentChannel = newChannel;
    	}
    	
    }
    
    public void channelUp() {
    	if(isOn && (currentChannel >= 3) && (currentChannel <= 18)) {
    		currentChannel+= 1;
    		if(currentChannel > 18) {
        		currentChannel = 3;
    	}
 
    	}
    	
    }
    
    public void channelDown() {
    	if(isOn && currentChannel == 3) {
    		currentChannel = 18;
    	}
    	else if(isOn && (currentChannel > 3 && currentChannel <= 18)) {
    		currentChannel -= 1;
    	}
    }
    
    public void raiseVolume() {
    	if( isOn && currentVolume < 10) {
    		currentVolume += 1;
    	}
    }
    public void lowerVolume() {
    	if( isOn && currentVolume > 0) {
    		currentVolume -=1;
    	}
    }
	

}
