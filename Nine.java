package hk222su_assign1;

import java.util.Scanner;

public class Nine {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner enter = new Scanner(System.in); //having problem with using the input scanner for promting enter - but works with this one
	    
		
		System.out.println("Hit the nine - best game ever!");	
		System.out.println(); //line break

			System.out.print("Would you like to play? y/n: ");
				String answer = input.next();		
					
					if (answer.equals("y") ) { //why does == not work here....						
						int humRollOne = (int) (Math.random() * ((6-1) + 1)) + 1; //using ((max-min)+min)+1 to set the limit for random
							System.out.println();//Line break
							System.out.println("You rolled your first dice: " + humRollOne);
							//Human second roll
							System.out.print("Are you feeling lucky, roll again? y/n: ");
								String answer2 = input.next();
									if (answer2.equals("y") ) {
										int humRollTwo = (int) (Math.random() * ((6-1) + 1)) + 1;
										int total = humRollOne + humRollTwo; 
										System.out.println("You rolled your second dice: " + humRollTwo + ", and your total score is: " + total);
										System.out.println();//line break										
										//Decide if player is still in the game					
											if (total <= 9)	{
												System.out.println("If you are ready, press enter and let the computer do its best.");					
												enter.nextLine(); //Why do I need two scanners - using input here does not work
			
											//Computers game
											int comRollOne = (int) (Math.random() * ((6-1) + 1)) + 1;
												System.out.println("The computers first dice: " + comRollOne);
													if (comRollOne <= 4) {
														int comRollTwo = (int) (Math.random() * ((6-1) + 1)) + 1;
														int comTotal = comRollOne + comRollTwo;
													System.out.println("The computers Second dice: " + comRollTwo + ", and total score is: " + comTotal);
												
													//Who wins ????
														if (total >= comTotal) {
															if (total > comTotal) {
																System.out.println();//Line break
																System.out.println("YOU WIN !!!!!");
																}
															else {
																System.out.println();//Line break
																System.out.println("We are all champions!");
																}
															}
														else {
															System.out.println();//Line break
															System.out.println("Better luck next time....sucker.");
															}
														  }
													else { 
														System.out.println("The Computer is a chicken and will let one dice do.");
														//Who wins when the computer is chicken
														if (total >= comRollOne) {
															if (total > comRollOne) {
																System.out.println();//Line break
																System.out.println("YOU WIN !!!!!");
																}
															else {
																System.out.println();//Line break
																System.out.println("We are all champions!");
																}
															}	
														else {
															System.out.println();//Line break
															System.out.println("Better luck next time.....sucker.");
												   			}
														 }
													}					
										  else //No computer you have already lost
											  System.out.println("So sorry, your were to greedy and got more then 9 - GAME OVER!" );
										  }
									
								//Last game decision If you decide not to roll again
									else  	{	
										System.out.println();//line break
										System.out.println("Then it is computers game!" + " Press enter");	
										enter.nextLine();				
										int comRollOne = (int) (Math.random() * ((6-1) + 1)) + 1;
										System.out.println("The computers first dice: " + comRollOne);
											if (comRollOne <= 4) {
												int comRollTwo = (int) (Math.random() * ((6-1) + 1)) + 1;
												int comTotal = comRollOne + comRollTwo;
												System.out.println("The computers Second dice: " + comRollTwo + ", and total score is: " + comTotal);
											if (comTotal > 9)
												System.out.println("The computer were to greedy and got more then 9 - YOU WIN!" );
											else {
										//Who wins ????
												if (humRollOne >= comTotal) {
													if (humRollOne > comTotal) {
														System.out.println();//Line break
														System.out.println("YOU WIN !!!!!");
														}
													else {
														System.out.println();//Line break
														System.out.println("We are all champions!");
														}					  
													  }
												else {
													System.out.println();//Line break
													System.out.println("Better luck next time....sucker.");
												     }
													}
												   }
											else {
												System.out.println("The Computer is a chicken and will let one dice do.");
												//Who wins when the computer is chicken
												if (humRollOne >= comRollOne) {
													if (humRollOne > comRollOne) {	
														System.out.println();//Line break
														System.out.println("YOU WIN !!!!!");
														}
													else {
														System.out.println();//Line break
														System.out.println("We are all champions!");
														}
													}
												else 
													System.out.println();//Line break
													System.out.println("Better luck next time.....sucker.");				
													}	
											}	
								}	
					      // You decide not to play at all 
						else {
							System.out.println();//Line break
							System.out.print("Your miss, this is an amazing game!!");
							}
	  
		input.close();
		enter.close();
	}
}