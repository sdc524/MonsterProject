package monsterController;

import model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster myMonster;
	
	
	
	//Constructor section
	public MonsterController()
	{
		//Job 1: intialize data members
		myMonster = new MarshmallowMonster("Marshmallow", 2.0, 2, true, 2);
	}
	
	
	
	//methods section
	public void start()
	{
		System.out.println(myMonster);
	}
}
