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
		int p1 = 10;
		int p2 = 12;
		int q1 = 8;
		int q2 = 14;
		double lineLength2;
		lineLength2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("The length of the line between two points is " + lineLength2);

		if (lineLength == lineLength2) {
			System.out.println("Both the lines are equal ");

		} else if (lineLength > lineLength2) {
			System.out.println(" The first line is  greater than second line ");
		} else if (lineLength < lineLength2) {
			System.out.println(" The second line is greater than the first line");
		}

	}
}
