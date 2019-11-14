package hk222su_assign1;

import java.util.Scanner; 

public class Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//input part
		System.out.println("Please enter three numbers.");
		System.out.println();//line break
			System.out.print("First number: ");
				int numA = input.nextInt();
			System.out.print("Second number: ");
				int numB = input.nextInt();
			System.out.print("Third number: ");
				int numC = input.nextInt();
				
		//Computation 
		if (numA > numB) {
			if (numA > numC) {
				if (numC > numB)
					System.out.println(numB + " " + numC + " " + numA);
				else
					System.out.println(numC + " " + numB + " " + numA);
				}
		    else
		    	System.out.println(numB + " " + numA + " " + numC);
			}		
		else {
			if (numB > numC) {
				if (numC > numA)
					System.out.println(numA + " " + numC + " " + numB);
				else
					System.out.println(numC + " " + numA + " " + numB);
				}
			else
				System.out.println(numA + " " + numB + " " + numC);
			}
			
		input.close();		

	}
}
