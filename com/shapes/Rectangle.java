package com.shapes;

import java.util.InputMismatchException;

import com.input.NegativeInputValueException;
import com.input.UserInput;

public class Rectangle extends ShapeContainer {

	public static void main(String[] args) {
	}

	@Override
	public void printShape(String pattern) {
		System.out.println("----- Rectangle ------");
		System.out.println(pattern);
	}

	@Override
	public void getUserInput(String string) throws InputMismatchException, NegativeInputValueException {
		System.out.println("Enter Row value for Rectangle:");
		totalRows = UserInput.getIntUserInput();
		System.out.println("Enter Column value for Rectangle:");
		totalColumns = UserInput.getIntUserInput();
		if (totalRows >= totalColumns) {
			throw new NegativeInputValueException("Column value should be greater than Row value!");
		}
	};

	@Override
	public String draw() {
		int row, column;
		StringBuilder pattern = new StringBuilder();
		for (row = 0; row < totalRows; row++) {
			for (column = 0; column < totalColumns; column++) {
				pattern.append("*");
			}
			pattern.append("\n");
		}
		return pattern.toString();
	}

}
