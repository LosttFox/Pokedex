package poke.model.monsters;

import poke.model.Pokemon;
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
}
