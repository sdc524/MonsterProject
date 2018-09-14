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
		
		
		
		System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this may arms:" + myMonster.getArmCount());
		JOptionPane.showMessageDialog(null, "My monster has 40 arms!");
		//make a new monster and customize from user input!
		
		{
		MarshmallowMonster userMonster;
		
		Scanner anotherInputScanner;
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		JOptionPane.showMessageDialog(null, "What is your name?");
		int answer = anotherInputScanner.nextInt();
		

		}
	}
}
