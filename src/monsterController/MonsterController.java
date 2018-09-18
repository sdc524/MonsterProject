package monsterController;

import java.util.Scanner;

import model.MarshmallowMonster;
import javax.swing.JOptionPane;

public class MonsterController
{
	private MarshmallowMonster myMonster;
	
	
	
	//Constructor section
	public MonsterController()
	{
		//Job 1: intialize data members
		myMonster = new MarshmallowMonster("Marshmallow", 2.0, 40, true, 2);
		
	}
	
	
	
	
	//methods section
	public void start()
	{
		JOptionPane.showMessageDialog(null, "Show message here.");
		//Use this method instead of "System.out.println("words");
		
		//System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		JOptionPane.showMessageDialog(null,"My monster has this may arms:" + myMonster.getArmCount());
		//make a new monster and customize from user input!
		
		JOptionPane.showMessageDialog(null, "Lets make you a monster!");
		MarshmallowMonster userMonster = new MarshmallowMonster();
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monster's name?");
		String userNumber = JOptionPane.showInputDialog(null,"How many arms?");
		if (validInt(userNumber))
		{
			int arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
		}
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try 
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type a integer value like -12345");
		}
		
		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}
		
		return isValid;
	}
		

		}

