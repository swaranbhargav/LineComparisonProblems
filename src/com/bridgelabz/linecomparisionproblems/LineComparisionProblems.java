package com.bridgelabz.linecomparisionproblems;

import java.util.Scanner;

public class LineComparisionProblems {

	public double x1, y1, x2, y2;

	public void readCoordinates() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1:");
		x1 = scanner.nextDouble();
		System.out.println("Enter y1:");
		y1 = scanner.nextDouble();
		System.out.println("Enter x2:");
		x2 = scanner.nextDouble();
		System.out.println("Enter y2:");
		y2 = scanner.nextDouble();
	}

	public double getLength() {
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program");

		LineComparisionProblems line1 = new LineComparisionProblems();
		LineComparisionProblems line2 = new LineComparisionProblems();

		System.out.println("Enter coordinates for line 1:");
		line1.readCoordinates();
		double length1 = line1.getLength();
		System.out.println("Length of line 1: " + length1);

		System.out.println("Enter coordinates for line 2:");
		line2.readCoordinates();
		double length2 = line2.getLength();
		System.out.println("Length of line 2: " + length2);

		if (Double.compare(length1, length2) == 0) {
			System.out.println("Both lines are equal");
		} else if (Double.compare(length1, length2) < 0) {
			System.out.println("Line 2 is greater");
		} else {
			System.out.println("Line 1 is greater");
		}
	}
}
