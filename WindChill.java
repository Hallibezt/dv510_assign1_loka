package hk222su_assign1;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter temperature in celcius: ");
			double temp = input.nextDouble();
			//The formula only works in a specific range of temperature and wind speed
			//Works only if the temperature is at or below 10 degrees and over 4.8 km/h wind speed
		if (temp <= 10) {
			System.out.print("Please, enter wind in m/s: ");
				double wind = input.nextDouble();
				//Change wind input from m/s to km/h for the formula below (that uses km/h)
				wind = (wind * 3.6);
					if (wind > 4.8) {		
						double windchill = 13.12 + (0.6215 * temp) - (11.37 * Math.pow(wind, 0.16)) + (0.3965 * temp * Math.pow(wind, 0.16));
						double windchillf = Math.round(windchill *10.0) / 10.0;
						//the decimal format,"%.1f", in print is important because so that e.g. 16.0 is printed with one decimal instead of just 16
						System.out.print("The windchill is: " + String.format("%.1f", windchillf) + " celcius");
						}
					else 
						System.out.print("Sorry, this calculator only works for wind above 4.8 km/h (approximately 1.3 m/s)");				
			}
		else 
			System.out.print("Sorry this calculator only works for temperature at or below 10 degree celsius");			
		
		input.close();
		
	}

}
