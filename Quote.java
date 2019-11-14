package hk222su_assign1;

import java.util.Scanner;

public class Quote {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please give me something to quote: ");	
			String quote = input.next(); 
		System.out.println ("This was written:" + "\"" + quote + "\"");
		
		input.close();
	}

}
