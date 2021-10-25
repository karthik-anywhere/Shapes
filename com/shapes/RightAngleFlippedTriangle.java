package com.shapes;

public class RightAngleFlippedTriangle extends ShapeContainer {

	public static void main(String[] args) {

	}

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Right Angled Flipped Triangle ------");
		System.out.println(pattern);
	}

	@Override
	public String draw() {

		int row, columnSpace, columnValue;
		StringBuilder pattern = new StringBuilder();
		for (row = 0; row < totalRows; row++) {
			for (columnSpace = 1; columnSpace < totalRows - row; columnSpace++) {
				pattern.append(" ");
			}
			for (columnValue = 0; columnValue <= row; columnValue++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		printShape(pattern.toString());
		return pattern.toString();
	}
}
