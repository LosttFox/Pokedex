package poke.model.monsters;

import poke.model.types.Psychic;

public class Mew extends Pokemon implements Psychic
{

	public Mew()
	{
		super(151, "Mew");
	}

	public Mew(String name)
	{
		super(151, name);
	}
	
	public Mew(int number, String name)
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
