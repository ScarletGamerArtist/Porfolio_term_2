package AlannaBotscharowSubtractionGame;
import java.util.Scanner;
import java.util.Random;


/*
 * Alanna Botscharow
 * 10/18
 * Subtraction game for first graders!
 */
public class SubtractioGame {

	public static void main(String[] args) {
		int x=1;
		while (x==1) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		//Get 2 random whole numbers
		
			int num1 = rand.nextInt(10); 
			int num2 = rand.nextInt(10);
		
		//Display question
			//if num1 > num2 (display question: num2 - num1) 
			//else display question: num1 - num2
				if (num1 > num2) {
					System.out.println(num1+" - "+num2);
				}
				else {
					System.out.println(num2+" - "+num1);
				}
		//get input (answer)
				
				int answer = input.nextInt(); 
		
		//Calculate
			//if num1 > num2 (calc1)
			//else (calc2) 
				int calc1 = num2 - num1; 
				int calc2 = num1 - num2; 
				 
			
		//Display answer
			//if answer == calc (correct)
			//else incorrect

					if (answer == calc1) {
						System.out.println("Correct! Nice job!");
					}
					else if (answer == calc2) {
						System.out.println("Correct! Nice job!");
					}
					else {
						System.out.println("That answer was wrong!");
						x=0;
						System.out.println("GAME OVER");
					}
					
					
		//Display correct answer
	}

 }
}
