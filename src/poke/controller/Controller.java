package poke.controller;

import poke.model.*;
import poke.model.monsters.Braixen;
import poke.model.monsters.Cinderace;
import poke.model.monsters.Eevee;
import poke.model.monsters.Espurr;
import poke.model.monsters.Fennekin;
import poke.model.monsters.Flareon;
import poke.model.monsters.Floragato;
import poke.model.monsters.Lucario;
import poke.model.monsters.Lugia;
import poke.model.monsters.Meowscarada;
import poke.model.monsters.Meowstic;
import poke.model.monsters.Mew;
import poke.model.monsters.Nickit;
import poke.model.monsters.Ninetales;
import poke.model.monsters.Riolu;
import poke.model.monsters.Sprigatito;
import poke.model.monsters.Sylveon;
import poke.model.monsters.Thievul;
import poke.model.monsters.Vulpix;
import poke.model.monsters.Zorua;
import poke.view.PokeFrame;
import java.util.ArrayList;

public class Controller
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	private PokeFrame window;
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "";
		
		createPokedex();
		
		this.window = new PokeFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void createPokedex()
	{
		pokedex.add(new Braixen());
		pokedex.add(new Cinderace());
		pokedex.add(new Eevee());
		pokedex.add(new Espurr());
		pokedex.add(new Fennekin());
		pokedex.add(new Flareon());
		pokedex.add(new Floragato());
		pokedex.add(new Lucario());
		pokedex.add(new Lugia());
		pokedex.add(new Meowscarada());
		pokedex.add(new Meowstic());
		pokedex.add(new Mew());
		pokedex.add(new Nickit());
		pokedex.add(new Ninetales());
		pokedex.add(new Riolu());
		pokedex.add(new Sprigatito());
		pokedex.add(new Sylveon());
		pokedex.add(new Thievul());
		pokedex.add(new Vulpix());
		pokedex.add(new Zorua());		
	}

	public String[] buildPokedexText()
	{
		String[] pokedexText = new String[pokedex.size()];
		
		for (int index = 0; index < pokedexText.length; index++)
		{
			pokedexText[index] = index + ": " + pokedex.get(index).getClass().getSimpleName();
		}
		
		return pokedexText;
	}
	
	public void updateCurrentPokemon(String name, int index, int health, boolean canEvolve)
	{
		Pokemon current = pokedex.get(index);
		
		current.setName(name);
		current.setHealth(health);
		current.setCanEvolve(canEvolve);
	}
}
