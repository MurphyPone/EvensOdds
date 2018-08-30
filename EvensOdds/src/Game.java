import java.util.Scanner;

public class Game {
	//TODO: Modularize the play portion to a method with static? players

	public static void main(String[] args) {
		//int player 1 (odd) gets assigned to a num between 0-9
		//int player 2 (even) gets assigned to a num between 0-9
		//int sum of both 
		//int win = sum% 2
		//if win = 0 even wins
		//else odd wins
		
		//Setup
		System.out.println("Welcome to Evens/Odds");
		System.out.println("\nThe goal of this game is pick a whole number which, "
				+ "when added to your oppenent's whole number will be even or odd, "
				+ "depending on which player you are.");
		int playerEven = 0;
		int playerOdd = 0;
		Scanner kb = new Scanner(System.in);
		
		//Player Select
		System.out.println("Player [Even]: Select an integer:");
		playerEven = kb.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //prevent cheating
		System.out.println("Player [odd]: Select an integer:");
		playerOdd = kb.nextInt();
		
		//Game "logic"
		int sum = playerEven + playerOdd;
		System.out.println("The sum was " + sum);
		if( sum % 2 == 0 ) { System.out.println("Player [Even] wins!"); }
		else { System.out.println("Player [odd] wins!"); }
		kb.close();
	}
}