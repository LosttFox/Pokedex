package poke.model.monsters;

import poke.model.types.Fire;

public class Flareon extends Eevee implements Fire
{

	public Flareon()
	{
		super(136, "Flareon");
	}

	public Flareon(String name)
	{
		super(136, name);
	}
	
	public Flareon(int number, String name)
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
