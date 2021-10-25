package com.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static int getOptionFromUser() throws InputMismatchException, NegativeInputValueException {

		System.out.println("Select shape option to draw: \n 1.Square \n 2.Rectangle \n 3.Right Angled Triangle "
				+ "\n 4.Right Angled Triangle Flipped \n 5.Isoceles Triangle \n 6.Diamond \n 7.Exit ");
		return getIntUserInput();
	}

	public static int getIntUserInput() throws NegativeInputValueException, InputMismatchException {
		Scanner s = ScannerSingleton.getInstance();
		int value = s.nextInt();
		return InputValidation.checkNegativeValue(value);
	}

	public static void main(String[] args) {
	}

}
