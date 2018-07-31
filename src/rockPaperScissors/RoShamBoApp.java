package rockPaperScissors;

//Created by Brian Seyferth on 7/31/2018

import java.util.Scanner;

public class RoShamBoApp {

	public static void main(String[] args) {
		
		//declared initial variables
		Scanner scnr = new Scanner(System.in);
		String userName;
		String opponent = "";
		String restart = "y";
		Roshambo opponentChoice = Roshambo.ROCK;
		Roshambo userChoice;
		int userScore = 0;
		int opponentScore = 0;
		
		//created the opponents
		Mike mike = new Mike("Mike");
		Koby koby = new Koby("Koby");
		Lebron lebron = new Lebron("Lebron");
		
		
		//print out a welcome statement and name statement to collect userName
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Enter a name?");
		userName = scnr.nextLine();
		
		//This while loop sets up the restart question
		while (restart.equals("y")) {
			
			//creates the human and generates and collects their choice
		Human human = new Human(userName, scnr);
		userChoice = human.generateRoshambo();
		
		//this while loop sets up if a user enters anything that isn't an opponent
		//boolean restarts every time if a player decides to restart prior to entering this loop
		boolean opponentGen = false;
		while(opponentGen == false) {
			
			//asks for opponent and collects info
		System.out.println("Who would you like to play?");
		System.out.println("(enter \"Mike\", \"Koby\", or \"Lebron\". Lebron is Random)");
		opponent = scnr.nextLine();
		
		//based on selected opponent the correct Roshambo method is generated
		//and sets the opponentGen to true as long as it matches
		if (opponent.equals("Mike")) {
			opponentChoice = mike.generateRoshambo();
			opponentGen = true;
			
		} else if (opponent.equals("Koby")) {
			
			opponentChoice = koby.generateRoshambo();
			opponentGen = true;
			
		}else if (opponent.equals("Lebron")) {
			
			opponentChoice = lebron.generateRoshambo();
			opponentGen = true;
			
			//this else is for anything that doesn't match opponent list
		} else {
			
			System.out.println("Your entry did not match an opponent. Please try again.");
			opponentGen = false;
			
		}
		}
		
		
		//displays the Roshambo results of each player
		System.out.println(userName + ": " + userChoice);
		System.out.println(opponent + ": " + opponentChoice);
		
		//calculates out who wins based on the results and adds 1 to each sides totals
		if (userChoice == Roshambo.ROCK && opponentChoice == Roshambo.ROCK) {
			System.out.println("Draw");
		} else if (userChoice == Roshambo.ROCK && opponentChoice == Roshambo.SCISSORS) {
			System.out.println(userName + " wins!");
			userScore = userScore + 1;
		} else if (userChoice == Roshambo.ROCK && opponentChoice == Roshambo.PAPER) {
			System.out.println(opponent + " wins!");
			opponentScore = opponentScore +1;
		} else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) {
			System.out.println(opponent + " wins!");
			opponentScore = opponentScore +1;
		} else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.ROCK) {
			System.out.println(userName + " wins!");
			userScore = userScore + 1;
		}else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.PAPER) {
			System.out.println("Draw");
		} else if (userChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.SCISSORS) {
			System.out.println("Draw");
		} else if (userChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.ROCK) {
			System.out.println(opponent + " wins!");
			opponentScore = opponentScore +1;
		}else {
			System.out.println(userName + " wins!");
			userScore = userScore + 1;
		}
		
		//asks and collects the restart information
		System.out.println("Would you like to keep playing? (\"y\" or \"n\")");
		restart = scnr.nextLine().trim();
		
		}
		
		//if restart is no then i print the final score for each side
		System.out.println("    FINAL SCORE    ");
		System.out.println("===================");
		System.out.println("Opponent(s):\t" + opponentScore);
		System.out.println(userName + ":\t\t" + userScore);
		
		//this if statement determines who wins based on the final score
		if(userScore == opponentScore) {
			
			System.out.println("It's a Draw! Great Job!");
			
		} else if (userScore > opponentScore) {
			
			System.out.println(userName + " is the winner!");

		}else {
			
			System.out.println("You lost!");
		}
		
		//prints the final goodbye statement when the program ends
		System.out.println("Goodbye!");
		
	}

}
