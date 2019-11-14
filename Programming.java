package hk222su_assign1;

import java.util.Scanner; 

public class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your three favorite programming languages.");
			System.out.print("First one: ");
				String first = input.nextLine(); 
			System.out.print("Second one: " );
				String second = input.nextLine(); 
			System.out.print("Third one: ");
				String third = input.nextLine(); 
		//alphabetical order permutation
		/* Use boolean compare.to for letters :
		   0 if ‘a’ is equal to ‘b’,
           a negative value if ‘a’is false and ‘b’ is true,
           a positive value if ‘a’ is true and ‘b’ is false. */
		if ((first.compareTo(second) < 0) && (second.compareTo(third) < 0)) {		
			System.out.println("Here are the chosen languages in an alphabetical order: " +  first + " " + second + " " + third);
		   } 
		else {
			if ((second.compareTo(third) < 0) && (first.compareTo(third) < 0)) {
				System.out.println("Here are the chosen languages in an alphabetical order: " +  second + " " + first + " " + third);
				}
			else {
				if ((third.compareTo(first) < 0) && (first.compareTo(second) < 0)) {
					System.out.println("Here are the chosen languages in an alphabetical order: " +  third + " " + first + " " + second);
					}
				else {
					if ((second.compareTo(third) < 0) && (third.compareTo(first) < 0)) {
						System.out.println("Here are the chosen languages in an alphabetical order: " +  second + " " + third + " " + first);
						}
					else {
						if ((first.compareTo(second) < 0) && (third.compareTo(second) < 0)) {
							System.out.println("Here are the chosen languages in an alphabetical order: " +  first + " " + third + " " + second);
							}
						else {
							if ((third.compareTo(second) < 0) && (second.compareTo(first) < 0)) {
								System.out.println("Here are the chosen languages in an alphabetical order: " +  third + " " + second + " " + first);
								}						  
							}		
						}				  
				     }
			  	  }
				}
		
		input.close();
		
	}
}

