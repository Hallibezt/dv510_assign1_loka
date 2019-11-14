package hk222su_assign1;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three digit number: ");
			int number = input.nextInt();
		
		//Get each number individually so it is possible to sum them up
		//The first number
		int number1 = number / 100;
		//here i get the middle number
		int number2 = number / 10;
		int number2f = number2 % 10;
		//the last one
		int number3 = number % 10; 		
		//sum up and print
		int sumOfNumbers = number1+ number2f + number3;		
		
		System.out.print("The sum of the digits is: " + sumOfNumbers);		
		
		input.close();		

	}
}

