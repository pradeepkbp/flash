package com.javaPrimitiveDatatype;

public class BiNumber {
	private int number1;
	private int number2;

	public BiNumber(int number1, int number2) { // generating method for constructor with int type parameters
	
		this.number1=number1;   //equating local variable and member variable
		this.number2=number2;   //equating local variable and member variable

	}

	public int add() {        // add method
		
		return number1+number2;
	}
 
	public int multiply() {         // multiply method
		return number1*number2;
	}

	public int getNumber1() {   // auto generated getters and setters for number 1 and number2
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void doublevalue() {  // creating doublevalue method
		this.number1*=2;
		this.number2*=2;
	}

}
