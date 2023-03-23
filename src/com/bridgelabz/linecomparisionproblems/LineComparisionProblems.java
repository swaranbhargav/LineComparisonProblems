package com.bridgelabz.linecomparisionproblems;

public class LineComparisionProblems {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1 = 5;
		int x2 = 6;
		int y1 = 4;
		int y2 = 7;
		double lineLength;
		lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The length of the line between twon points is " + lineLength);
	}

}
