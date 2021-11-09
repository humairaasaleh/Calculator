package com.community.qa;

public class Calculator {
	public static int result;

	public static int add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}

	public static int sub(int num1, int num2) {
		result = num1 - num2;
		return result;
	}

	public static int mul(int num1, int num2) {
		result = num1 * num2;
		return result;
	}

	public static int div(int num1, int num2) {
		result = num1 / num2;
		return result;
	}

	public static int mod(int num1, int num2) {
		result = num1 % num2;
		return result;
	}
	
	public static int sqaure(int num1) {
		result = num1*num1;
		return result;
	}

}
