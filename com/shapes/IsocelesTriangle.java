package com.shapes;

public class IsocelesTriangle extends ShapeContainer {

	public static void main(String[] args) {
		// This method is empty, we don't need implementations in the main method.
	}

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Isoceles Triangle ------");
		System.out.println(pattern);
	}

	@Override
	public String draw() {
		int row, columnSpace, columnValue;
		StringBuilder pattern = new StringBuilder();
		System.out.println("----- isoceles Triangle ------");
		for (row = 0; row < totalRows; row++) {
			for (columnSpace = 1; columnSpace < totalRows - row; columnSpace++) {
				pattern.append(" ");
			}

			for (columnValue = 0; columnValue <= row * 2; columnValue++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		printShape(pattern.toString());
		return pattern.toString();
	}
}
