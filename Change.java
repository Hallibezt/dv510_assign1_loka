package hk222su_assign1;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Total price: ");
				double totalPrice = input.nextDouble();
		
			System.out.print("Payment: ");
				double totalPayment = input.nextDouble();	
		
				//Typecasting to change double to int (int) and get rid of decimals
				int change = (int)totalPayment - (int)totalPrice;
		
					System.out.println("Change: " + change);
		
						int kr1000 = change / 1000;
						change = change % 1000;
		
						int kr500 = change / 500;
						change = change % 500;
		
						int kr200 = change / 200;
						change = change % 200;
		
						int kr100 = change / 100;
						change = change % 100;
		
						int kr50 = change / 50;
						change = change % 50;
		
						int kr20 = change / 20 ;
						change = change % 20;
		
						int kr10 = change / 10;
						change = change % 10;
		
						int kr5 = change / 5;
						change = change % 5;
		
						int kr2 = change / 2;
						change = change % 2;
		
						int kr1 = change / 1;
						change = change % 1;
		
							System.out.println("1000 kr bills: " + kr1000);
							System.out.println("500 kr bills: " + kr500);
							System.out.println("200 kr bills: " + kr200);
							System.out.println("100 kr bills: " + kr100);
							System.out.println("50 kr bills: " + kr50);
							System.out.println("20 kr bills: " + kr20);
							System.out.println("10 kr bills: " + kr10);
							System.out.println("5 kr bills: " + kr5);
							System.out.println("2 kr bills: " + kr2);
							System.out.println("1 kr bills: " + kr1);
		input.close();

	}

}
