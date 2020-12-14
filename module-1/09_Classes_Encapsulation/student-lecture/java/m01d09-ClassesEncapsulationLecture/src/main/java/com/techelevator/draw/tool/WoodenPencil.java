



/*Package definition, lowercase, separated by periods
aligns with purpose of project, art to how many package 
vs how many classes per package
 * 
 * 
 * 
 */
package com.techelevator.draw.tool;

//imports
import java.awt.Color;

//class declaration - PascalCase - they are traditionally singular

public class WoodenPencil {

	//class variables (fields)
	
	//constants - variable definitions that cannot be changed
	//access    part of the class not the instance - 
	//           static -will be true across all copies, it does not change ( if it's static, should also have final )
	//           final - once its assigned a value, the value cannot change
	public        static                              final double defaultLength = 8.0;
	public static final int  defaultShape = 2;
	public static final String defaultHardness = "HB";
	public static final double defaultStubLength = 2.0;
	public static final double defaultMaxDullness = 3.0;
	
	//instance variables - private variable for the class itself acess modifier - variable name
	//  can use them inside the class when assigned to private
	
	private double length;
	private int shape;
	private Color color;
	private String hardness;
	private double sharpness;
	
	//getters and setters
	
	public double getLength() {
		return length;
	}
	
	public int getShape() {
		return shape;
	}
	
	//Derivative getter, calculated on the fly from other values in the class
	public boolean isSharp(){
		if(this.sharpness >= defaultMaxDullness) {
			return true;
			}
		else {
			return false;
		}
	}



// Constructors give us our values for instance variables. Constructors have the same 
// name as the class. The method you use to build the class. use it to initialize your pencil

	
	// THis is an empty constructor - will give us all the default parameters. And create
	// a default pencil style - For multiple constructors with the same name to work
	// you need to have different arguments for each
	
public WoodenPencil() {
	this(defaultLength, defaultShape,defaultHardeness,defaultColor)
}
	
	// The constructor when you want to specify everything
	public WoodenPencil(double length, int shape, String hardness, Color color, double sharpness) {
	
	//set the color
	if( color != null) {
	this.color = color;
	} else {
		this.color = null;
	}
	
	//instance methods
	public boolean sharpen() {
		double newLength =  this.length - .25;
		if(newLength >= defaultStubLength && newLength >=00) {
			this.sharpness = 1.0;
			this.length = newLength;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//Runs the program
	public static void main(String[] args) {
		
		//creates a new instance - make a new woodenPencil
		//yu
		WoodenPencil forTheSat = new WoodenPencil(sharpness, shape, hardness, color, sharpness)
	}
		
	
	}
}