package hk222su_assign1;

import java.util.Scanner; 

public class DoctorWho {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Please, put in a year of desired season ");
				int year = input.nextInt();
					//boolean 
					if (year < 1963)
						System.out.print("The show had not been published yet");
						if (year >= 1963)
								if (year > 1989) 
										if (year >=2005) 
												if (year > 2020)
													System.out.print("I have no idea what will happen");
												else
													System.out.print("You have chosen a \"modern serie\"");				
										else 
											System.out.print("People lost interest, no show");				
								else 
									System.out.print("It is the old school original");		
		
		input.close();		
 
    }
}
