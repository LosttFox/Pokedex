package poke.model.monsters;

import poke.model.types.Dark;

public class Meowscarada extends Floragato implements Dark
{

	public Meowscarada()
	{
		super(908, "Meowscarada");
	}

	public Meowscarada(String name)
	{
		super(908, name);
	}
	
	public Meowscarada(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void nightSlash(int temp)
	{
		// TODO Auto-generated method stub
		
	}
}
