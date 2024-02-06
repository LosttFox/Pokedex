package poke.model.monsters;

import poke.model.types.Fairy;

public class Sylveon extends Eevee implements Fairy
{

	public Sylveon()
	{
		super(700, "Sylveon");
	}

	public Sylveon(String name)
	{
		super(700, name);
	}
	
	public Sylveon(int number, String name)
	{
		super(number, name);
	}

	@Override
	public void drainingKiss()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playRough()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
