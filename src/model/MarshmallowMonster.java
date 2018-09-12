package model;

public class MarshmallowMonster
{
	
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;

	public MarshmallowMonster()
	{
		//Default values are 0 or null Boring :(
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
  
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	
	//Getters
	
	public String getName()
	{
		return name;
	}
	
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount;
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNose(boolean hasNose)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	{
		this.eyeCount = eyeCount;
		this.name = name;
		this.legCount = legCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	public String toString()
	{
		String description = " My monsters name is " + "Fuzz "
							+legCount + " legs "
							+name + 
							+eyeCount + " eyes "
							+hasNoses + " noses "
							+armCount + " arms "
							+ " rawararghh!:";
		return description;
	}
}