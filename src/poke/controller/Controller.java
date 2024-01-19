package poke.controller;

import poke.model.*;
import java.util.ArrayList;

public class Controller
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "";
		
		createPokedex();
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
}
