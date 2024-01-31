package poke.model.monsters;

import poke.model.Pokemon;
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
}
