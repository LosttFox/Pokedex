package poke.model.monsters;

import poke.model.types.Normal;

public class Eevee extends Pokemon implements Normal
{

	public Eevee()
	{
		super(133, "Eevee");
	}
	
	public Eevee(String name)
	{
		super(133, name);
	}
	
	public Eevee(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void copycat(int lastMove)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endure()
	{
		// TODO Auto-generated method stub
		
	}
}
