package AlannaBotscharowChapter4Prog4;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 10/18
 * Heads or tails game
 */
public class Chapter4Program4 {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		// Get guess from user. 
			//heads or tails
		
				System.out.println("Heads or tails? Enter 1 for heads and 0 for tails.");
				int guess = input.nextInt(); 
				
		
		
		//Randomly generate an integer, 1 or 0 
			//1 = heads. 0 = tails.
				
				int coin = (int)(Math.random()* 2);
					
					
					
		//Determine if the user wins. 
					//Display if the user is correct. 
					
				if (guess == coin 
						&& guess == 1) {
					System.out.println("The coin landed on heads. You win!");
				}
				else if (guess == coin
						&& guess == 0) {
					System.out.println("The coin landed on tails. You win!");
				}
				else if (guess != coin 
						&& guess == 0) {
					System.out.println("The coin landed on heads. You lose!");
				}
				else if (guess != coin
						&& guess == 1) {
					System.out.println("The coin landed on tails. You lose!");
				}
				else {
					System.out.println("Something went wrong.");
					System.out.println("Make sure that you are entering a number between 1 and 0!");
				}
				
					
				

		
		

	}

}
