package poke.model.monsters;

import poke.model.types.Grass;

public class Sprigatito extends Pokemon implements Grass
{

	public Sprigatito()
	{
		super(906, "Sprigatito");
	}

	public Sprigatito(String name)
	{
		super(906, name);
	}
	
	public Sprigatito(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void leafage()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean energyBall(int enemyDefense)
	{
		// TODO Auto-generated method stub
		return false;
	}
}
