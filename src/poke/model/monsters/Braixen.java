package poke.model.monsters;

import poke.model.types.Fire;

public class Braixen extends Fennekin implements Fire
{

	public Braixen()
	{
		super(654, "Braixen");
		setup(59, false);
	}
	
	public Braixen(String name)
	{
		super(654, name);
		setup(59, false);
	}
	
	public Braixen(int number, String name)
	{
		super(number, name);
		setup(59, false);
	}
}
