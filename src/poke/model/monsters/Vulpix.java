package poke.model.monsters;

import poke.model.types.Fire;

public class Vulpix extends Pokemon implements Fire
{

	public Vulpix()
	{
		super(37, "Vulpix");
	}

	public Vulpix(String name)
	{
		super(37, name);
	}
	
	public Vulpix(int number, String name)
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
