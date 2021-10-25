package com.shapes;

public class ShapeFactory {
	static ShapeContainer getShapes(int option) {
		switch (option) {
		case 1:
			return new Square();
		case 2:
			return new Rectangle();
		case 3:
			return new RightAngleTriangle();
		case 4:
			return new RightAngleFlippedTriangle();
		case 5:
			return new IsocelesTriangle();
		case 6:
			return new Diamond();
		default:
			System.out.println("Please Enter valid Option!");
		}
		return null;
	}

	public static void main(String[] args) {

	}

}
