package June;

import java.util.Scanner;

public class Calculator {
	static double sum(double inParam1, double inParam2){
		return (inParam1 + inParam2);
	}

	static double subtract(double inParam1, double inParam2){
		return (inParam1 - inParam2);
	}

	static double multiply(double inParam1, double inParam2){
		return (inParam1 * inParam2);
	}

	static double divide(double inParam1, double inParam2){
		return (inParam1 / inParam2);
	}


	public static void main(String[] args){
		double num1;
		double num2;
		char operator;
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter an Operator ( +  -  /  * ): ");
		operator = scan.next().charAt(0);
		System.out.println("Enter a Number: ");
		num2 = scan.nextDouble();
		switch (operator) {
			case '+' -> System.out.println(sum(num1, num2));
			case '-' -> System.out.println(subtract(num1, num2));
			case '/' -> System.out.println(divide(num1, num2));
			case '*' -> System.out.println(multiply(num1, num2));
		}
	}
}
