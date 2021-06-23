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
     	int total_dice_count = 0;
	// UC4 while loop for repeat till player won
			System.out.println("Game Played by the player");
			System.out.println(" ");
			while( currentPosition < ENDING_POSITION )
			{
				int DICE = (random.nextInt(6)+1);
				total_dice_count++;
				

//UC3 defining Snake, Ladder or no play
	int action = random.nextInt(3);
	if(action == 1 && (currentPosition + DICE <= ENDING_POSITION))
	{
		currentPosition = currentPosition + DICE;
	}
	else if(action == 2 && (currentPosition - DICE >= STARTING_POSITION))
	{

			currentPosition = currentPosition - DICE;
	}
	else
	{
	} 
	
System.out.println("Dice : "+DICE+" | Current Position : "+ currentPosition);

}
			System.out.println(" ");
			//UC6 total times dice throws
			System.out.println("Total Count of Dice Throws : "+total_dice_count);
		}

	public static <SnakeAndLadder> void main(String args[])
	{
		SnakeAndladderproblem	Player = new SnakeAndladderproblem();	
		Player.GamePlayed();
	}
}
