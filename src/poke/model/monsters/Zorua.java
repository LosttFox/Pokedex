package poke.model.monsters;

import poke.model.Pokemon;
import poke.model.types.Dark;

public class Zorua extends Pokemon implements Dark
{

	public Zorua()
	{
		super(570, "Zorua");
	}

	public Zorua(String name)
	{
		super(570, name);
	}
	
	public Zorua(int number, String name)
	{
		super(number, name);
	}
	
	public void pureDoom(int demo)
	{
		
	}
}
