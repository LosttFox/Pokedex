package poke.model.monsters;

import poke.model.types.Steel;

public class Lucario extends Riolu implements Steel
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

	@Override
	public boolean metalClaw()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean flashCannon()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
