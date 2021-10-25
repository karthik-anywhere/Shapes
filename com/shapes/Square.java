package com.shapes;

public class Square extends ShapeContainer {

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Square ------");
		System.out.println(pattern);
	}

	@Override
	public String draw() {
		int row, column;
		StringBuilder pattern = new StringBuilder();

		for (row = 0; row < totalRows; row++) {
			for (column = 0; column < totalRows; column++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		return pattern.toString();
	}
}
