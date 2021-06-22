package com.bridgelabz;
import java.util.*;
public class SnakeAndladderproblem
{
//UC1 Initializing Starting position of game
	static final int STARTING_POSITION = 0;
	static final int ENDING_POSITION = 100;
	public void RollingDice()
	{
		Random random = new Random();
		int DICE = (random.nextInt(6)+1);
		System.out.println("Rolling Dice :"+DICE);
	}

	public static void main(String args[])
	{
		SnakeAndladderproblem Game1 = new snakeandladder();
		Game1.RollingDice();
	}
}