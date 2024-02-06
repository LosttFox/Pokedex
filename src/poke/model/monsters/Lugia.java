package poke.model.monsters;

import poke.model.types.Flying;
import poke.model.types.Psychic;

public class Lugia extends Pokemon implements Psychic, Flying
{

	public Lugia()
	{
		super(249, "Lugia");
	}

	public Lugia(String name)
	{
		super(249, name);
	}
	
	public Lugia(int number, String name)
	{
		super(number, name);
	}
}
