package hk222su_assign1;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter seconds ");
			int seconds = input.nextInt();	
			//First get seconds in the format of minutes and hours
			int minutes = seconds / 60;
			int hours = minutes / 60;
			//Then find the hour remainders in minutes and minute remainders in seconds and print out HH:MM:SS
			int remainingMinutes = minutes % 60;
			int remainginSeconds = seconds % 60;
		System.out.print("Entered seconds are equal to : " + hours + " hours, " + remainingMinutes + " minutes and " + remainginSeconds + " seconds." );
		
		input.close();

	}	

}
