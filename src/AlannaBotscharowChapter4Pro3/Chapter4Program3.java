package AlannaBotscharowChapter4Pro3;
import java.util.Scanner; 

/*
 * Alanna Botscharow
 * 10/18
 */
public class Chapter4Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a three-digit integer.
			System.out.println("Enter a three-digit integer: ");
				int number = input.nextInt();
				
				//Digits 
					int digit1 = number / 100;  
					int digit2 = number %100; 
					int digit3 = number % 10;
				
					
					
		
					
		//Determine if it is a palindrome. 
			//It must read left to right, and right to left. 121  767  939 
					//Display the results 
					if (digit1 == digit3) {
						System.out.println(number+" is a palindrome!");
					}
					else {
						System.out.println(number+" is not a palindrome.");
					}
				
				
				
		
		
		
		

	}

}
