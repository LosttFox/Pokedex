package poke.model.monsters;

import poke.model.types.Fire;

public class Fennekin extends Pokemon implements Fire
{

	public Fennekin()
	{
		super(653, "Fennekin");
	}

	public Fennekin(String name)
	{
		super(653, name);
	}
	
	public Fennekin(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void flamethrower()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean heatWave()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
