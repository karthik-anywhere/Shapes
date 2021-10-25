package com.shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.input.CustomException;
import com.input.NegativeInputValueException;
import com.input.ScannerSingleton;
import com.input.UserInput;

public class Shape {

	public static void main(String[] args) throws CustomException {
		boolean exit = false;
		do {
			try {
				int option = UserInput.getOptionFromUser();
				if (option != 7) {
					ShapeContainer shape = ShapeFactory.getShapes(option);
					shape.getUserInput(shape.getClass().getSimpleName());
					shape.printShape(shape.draw());
				} else {
					exit = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter only Integer value !");
				throw new CustomException("some");
			} catch (NegativeInputValueException e) {
				System.out.println(e.getMessage());
				throw new CustomException("Negative");
			}
		} while (!exit);
		Scanner s = ScannerSingleton.getInstance();
		s.close();
	}
}
