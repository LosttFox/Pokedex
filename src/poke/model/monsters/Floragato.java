package poke.model.monsters;

import poke.model.types.Grass;

public class Floragato extends Sprigatito implements Grass
{

	public Floragato()
	{
		super(907, "Floragato");
	}

	public Floragato(String name)
	{
		super(907, name);
	}
	
	public Floragato(int number, String name)
	{
		super(number, name);
	}
}
