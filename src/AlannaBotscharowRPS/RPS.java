package AlannaBotscharowRPS;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 10/18
 * Rock paper scissors
 */
public class RPS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		
		// Generates a number 0 - 2.
			//0 = rock, 1 = paper, 2 = scissors.
		
			int rps = (int)(Math.random()* 3);
		
		
		//Prompt the user to enter a number 0 - 2. 
		
			System.out.println("Rock, paper, or scissors?");
			System.out.println("Please enter a number between 0 through 3 for your answer.");
			System.out.println();
			System.out.println("Rock = 0, Paper = 1, Scissors = 2");
			
				int guess = input.nextInt(); 
		
	
		
		//if statements
			/*Rock > scissors
			 * scissors > paper
			 * paper > rock 
			 */
				//Display whether the computer wins, loses, or draws
				
			
				if (rps == guess
						&guess == 0) {
					System.out.println("Rock! It is a tie!");
					
				}
				else if (rps == guess
						&guess == 1) {
					System.out.println("Paper! It is a tie!");
					
				}
				else if (rps == guess
						&guess == 2) {
					System.out.println("Scissors! It is a tie!");
					
				}
				else if (rps == 0
						& guess == 2) {
					System.out.println("Rock! You lose!");
				}
				else if (rps == 0
						& guess == 1) {
					System.out.println("Rock! You win!");
				}
				else if (rps == 1
						& guess == 2) {
					System.out.println("Paper! You win!");
				}
				else if (rps == 1
						& guess == 0) {
					System.out.println("Paper! You lose!");
				}
				else if (rps == 2
						& guess == 1) {
					System.out.println("Scissors! You lose!");
				}
				else if (rps == 2
							& guess == 0) {
						System.out.println("Scissors! You win!");	
				}
				else { 
					System.out.println("Something went wrong. Please try again.");
				}
		

		
		
		
		
		
		
	}

}
