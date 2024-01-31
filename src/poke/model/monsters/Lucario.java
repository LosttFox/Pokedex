package poke.model.monsters;

import poke.model.types.Fighting;
import poke.model.types.Steel;

public class Lucario extends Riolu implements Fighting, Steel
{

	public Lucario()
	{
		super(448, "Lucario");
	}

	public Lucario(String name)
	{
		super(448, name);
	}
	
	public Lucario(int number, String name)
	{
		super(number, name);
	}
}
