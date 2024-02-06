package poke.model.monsters;

import poke.model.types.Fighting;

public class Riolu extends Pokemon implements Fighting
{

	public Riolu()
	{
		super(447, "Riolu");
	}

	public Riolu(String name)
	{
		super(447, name);
	}
	
	public Riolu(int number, String name)
	{
		super(number, name);
	}
}
