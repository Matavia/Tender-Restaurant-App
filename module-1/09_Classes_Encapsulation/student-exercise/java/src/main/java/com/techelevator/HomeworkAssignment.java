package com.techelevator;

//class declaration
public class HomeworkAssignment {

	// class variables/fields

	// constant variables

	// instance variables

	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;

	// getters and setters

	public int getEarnedMarks() {
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;

		// derived getters
	}

	public String getLetterGrade() {
		double gradePercent = earnedMarks * 100 / possibleMarks;

		if (gradePercent >= 90) {
			letterGrade = "A";

		} else if (gradePercent >= 80 && gradePercent <= 89) {
			letterGrade = "B";
		} else if (gradePercent >= 70 && gradePercent <= 79) {
			letterGrade = "C";
		} else if (gradePercent >= 60 && gradePercent <= 69) {
			letterGrade = "D";
		}

		else {
			letterGrade = "F";
		}

		return letterGrade;
	}

	// constructors
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
}

// methods
