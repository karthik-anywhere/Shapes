package com.shapes;

public class RightAngleTriangle extends ShapeContainer {

	public static void main(String[] args) {
	}

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Right Angled Triangle ------");
		System.out.println(pattern);
	}

	@Override
	public String draw() {

		int row, column;
		StringBuilder pattern = new StringBuilder();
		for (row = 0; row < totalRows; row++) {
			for (column = 0; column <= row; column++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		return pattern.toString();
	}

}
