package poke.model.monsters;

import poke.model.types.Fire;

public class Cinderace extends Pokemon implements Fire
{
	public Cinderace()
	{
		super(816, "Cinderace");
	}
	
	public Cinderace(String name)
	{
		super(816, name);
	}
	
	public Cinderace(int number, String name)
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
