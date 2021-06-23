package com.bridgelabz;
import java.util.*;
public class SnakeAndladderproblem
{
//UC1 Initializing Starting position of game
	static final int STARTING_POSITION = 0;
	static final int ENDING_POSITION = 100;
	public void GamePlayed()
	{
	//UC2 Initializing Rolling Dice
		Random random = new Random();
	int currentPosition = STARTING_POSITION ;
	// UC4 while loop for repet till player won
			System.out.println("Game Played by the player");
			System.out.println(" ");
			while( currentPosition < ENDING_POSITION )
			{
				int DICE = (random.nextInt(6)+1);

//UC3 defining Snake, Ladder or no play
	int action = random.nextInt(3);
	
	//System.out.println("Rolling Dice : "+DICE);
	//System.out.println("Action perform :"+action);
	if(action == 1 && (currentPosition + DICE <= ENDING_POSITION))
	{

			currentPosition = currentPosition + DICE;
			//System.out.println("Player moves for Ladder");
	}
	else if(action == 2 && (currentPosition - DICE >= STARTING_POSITION))
	{

			currentPosition = currentPosition - DICE;
			//System.out.println("Player moves for Snake");
	}
	else
	{
			// System.out.println("No Play");
	}
	//UC5 Player reaches at exact winning position 
	

	System.out.println("Dice : "+DICE+" | Current Position : "+ currentPosition);

}
			System.out.println(" ");

	}

	public static <SnakeAndLadder> void main(String args[])
	{
		SnakeAndladderproblem	Player = new SnakeAndladderproblem();	
		Player.GamePlayed();
	}
}
