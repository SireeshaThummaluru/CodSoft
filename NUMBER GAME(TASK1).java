package siri3;
import java.util.Random;
import java.util.Scanner;
	public class NumberGuessingGame {
		public static void main(String[] args) {
	        Random rand = new Random();
	        Scanner scanner = new Scanner(System.in);

	        int correctGuesses = 0;
	        System.out.println("*********************************************");
	        System.out.println("*                                           *");
	        System.out.println("*      Welcome to the Number Guessing Game  *");
	        System.out.println("*                                           *");
	        System.out.println("*********************************************");
	        System.out.println("*                                           *");
	        System.out.println("*   You have 3 attempts to guess the number *");
	        System.out.println("*      The number is between 1 and 100      *");
	        System.out.println("*                                           *");
	        System.out.println("*********************************************");

	        int randomNumber = rand.nextInt(100) + 1;
	        int trycount = 0;
	        while (trycount < 3) {
	            System.out.print("Attempt " + (trycount + 1) + ": Enter your guessed number (1-100): ");
	            int playerGuess = scanner.nextInt();
	            trycount++;

	            if (playerGuess == randomNumber) {
	                System.out.println("*********************************************");
	                System.out.println("*                                           *");
	                System.out.println("*           Correct! You Win               *");
	                System.out.println("*                                           *");
	                System.out.println("*********************************************");
	                correctGuesses++;
	                break;
	            } else if (playerGuess < randomNumber) {
	                System.out.println("*********************************************");
	                System.out.println("*                                           *");
	                System.out.println("*   Nope! The number is higher. Guess again. *");
	                System.out.println("*                                           *");
	                System.out.println("*********************************************");
	            }
	            if (trycount == 3) {
	                System.out.println("*********************************************");
	                System.out.println("*                                           *");
	                System.out.println("*                                           *");
	                System.out.println(" Out of attempts! The correct number was: " + randomNumber);
	                System.out.println("*                                           *");
	                System.out.println("*********************************************");
	                break;
	            }
	        }
	        int score = correctGuesses;
	        System.out.println("*********************************************");
	        System.out.println("*                                           *");
	        System.out.println("*             Game Over!                    *");
	        System.out.println("*          Your score: " + score + "/3            *");
	        System.out.println("*                                           *");
	        System.out.println("*********************************************");
	        scanner.close();
	    }
	}    
