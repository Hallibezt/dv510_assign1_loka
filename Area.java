package hk222su_assign1;

import java.util.Scanner; 

public class Area {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter a radius ");		
			float radius = input.nextFloat(); //used float here because the assignment asked for it - would use double otherwise 		
			double area = Math.round(radius * radius * Math.PI * 10.0) / 10.0; 
			System.out.print("A circle with the radius " + radius + " has the area of: " + area);
		
		input.close();

	}   
	                                 
}
