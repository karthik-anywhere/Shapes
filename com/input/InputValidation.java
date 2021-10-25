package com.input;

public class InputValidation {

	public static int checkNegativeValue(int value) throws NegativeInputValueException {
		if (value < 0) {
			throw new NegativeInputValueException("Please Enter only Positive value!");
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
