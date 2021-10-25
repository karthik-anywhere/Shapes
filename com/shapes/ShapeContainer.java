package com.shapes;

import java.util.InputMismatchException;

import com.input.NegativeInputValueException;
import com.input.UserInput;

abstract class ShapeContainer {

	public int totalRows, totalColumns;

	protected void getUserInput(String string) throws InputMismatchException, NegativeInputValueException {
		System.out.println("Enter Row value for " + string);
		totalRows = UserInput.getIntUserInput();
	};

	abstract void printShape(String pattern);

	abstract String draw();

	public static void main(String args) {

	}

}
