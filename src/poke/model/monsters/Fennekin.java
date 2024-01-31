package poke.model.monsters;

import poke.model.Pokemon;
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
}
