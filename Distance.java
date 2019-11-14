package hk222su_assign1;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//coordination 1
			System.out.println("Please, enter coordinate for point 1:"  + " (x" + "," + "y)");
			System.out.print("x = ");		
				int pointx1 = input.nextInt();
			System.out.print("y = ");
				int pointy1 = input.nextInt();
				System.out.println("The coordinate of Point 1 is: "  + "(" + pointx1 + "," + pointy1 + ")" );
				System.out.println(); //line break
		
		//coordination 2
			System.out.println("Please, enter coordinate for point 2:"  + " (x" + "," + "y)");
			System.out.print("x = ");		
				int pointx2 = input.nextInt();
			System.out.print("y = ");
				int pointy2 = input.nextInt();
				System.out.println("The coordinate for Point 2 is: "  + "(" + pointx2 + "," + pointy2 + ")");
				System.out.println();//line break
		
		//calculation and solution
			int xdistance = pointx1 - pointx2; 
			int ydistance = pointy1 - pointy2;
			double finaldistance = (Math.sqrt(Math.pow(xdistance, 2) + Math.pow(ydistance, 2)));		
		
			double round = Math.round(finaldistance * 1000.0) / 1000.0;
				System.out.print("The distance between point one and two is: " + String.format("%.3f",round));
				
		input.close();
		
	}

}
