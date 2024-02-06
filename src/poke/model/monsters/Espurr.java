package poke.model.monsters;

import poke.model.types.Psychic;

public class Espurr extends Pokemon implements Psychic
{

	public Espurr()
	{
		super(677, "Espurr");
	}

	public Espurr(String name)
	{
		super(677, name);
	}
	
	public Espurr(int number, String name)
	{
		super(number, name);
	}

	@Override
	public boolean confusion()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void trick()
	{
		// TODO Auto-generated method stub
		
	}
}
