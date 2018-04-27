package com.javaPrimitiveDatatype;

public class BiNumberRunner {

	public static void main(String[] args) {
		
		BiNumber numbers =new BiNumber(2,3);
		
		System.out.println(numbers.add()); //2+3
		System.out.println(numbers.multiply());//2*3
		
		numbers.doublevalue(); // double both numbers
		
		System.out.println(numbers.getNumber1()); // fetching number1
		System.out.println(numbers.getNumber2()); // fetching number2
		

	}

}
