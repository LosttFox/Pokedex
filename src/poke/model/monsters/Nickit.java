package poke.model.monsters;

import poke.model.Pokemon;
import poke.model.types.Dark;

public class Nickit extends Pokemon implements Dark
{

	public Nickit()
	{
		super(827, "Nickit");
	}

	public Nickit(String name)
	{
		super(827, name);
	}
	
	public Nickit(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void pureDoom(int temp)
	{
		// TODO Auto-generated method stub
		
	}
}
