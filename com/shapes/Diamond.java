package com.shapes;

public class Diamond extends ShapeContainer {

	public static void main(String[] args) {
		// This method is empty, we don't need implementations in the main method.
	}

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Diamond ------");
		System.out.println(pattern);
	}

	@Override
	public String draw() {
		int row, columnSpace, columnValue;
		StringBuilder pattern = new StringBuilder();

		// Upper part of the diamond similar to Isoceles Triangle.

		for (row = 0; row < totalRows; row++) {
			for (columnSpace = 1; columnSpace < totalRows - row; columnSpace++) {
				pattern.append(" ");
			}

			for (columnValue = 0; columnValue <= row * 2; columnValue++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}

		// Lower part of the diamond reducing the pattern from high to low.

		for (row = totalRows - 1; row >= 1; row--) {
			for (columnSpace = 1; columnSpace <= totalRows - row; columnSpace++) {
				pattern.append(" ");
			}

			for (columnValue = 1; columnValue < row * 2; columnValue++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		if (totalRows > 0)
			printShape(pattern.toString());
		return pattern.toString();
	}
}
