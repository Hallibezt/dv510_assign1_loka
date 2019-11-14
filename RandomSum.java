package hk222su_assign1;

import java.util.Scanner; 

public class RandomSum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		//Use down casting since Math.random gives floating)
		//Add one to exclude 0 
		int number1 = (int)(Math.random()*100 + 1);
		int number2 = (int)(Math.random()*100 + 1);
		int number3 = (int)(Math.random()*100 + 1);
		int number4 = (int)(Math.random()*100 + 1);
		int number5 = (int)(Math.random()*100 + 1);
		
		//Print out the random numbers
		System.out.print("Five random numbers from [1-100]: ");
			System.out.print(number1 + " ");
			System.out.print(number2 + " ");
			System.out.print(number3 + " ");
			System.out.print(number4 + " ");
			System.out.println(number5 + " ");
		
		//Calculate the sum and print it
		int sum = number1 + number2 + number3 + number4 + number5;
		System.out.print("The sum on the numbers is: " + sum);
		
		input.close();

		
	}

}
