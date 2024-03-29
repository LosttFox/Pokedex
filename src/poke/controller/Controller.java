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
import poke.model.monsters.Pokemon;
import poke.model.monsters.Riolu;
import poke.model.monsters.Sprigatito;
import poke.model.monsters.Sylveon;
import poke.model.monsters.Thievul;
import poke.model.monsters.Vulpix;
import poke.model.monsters.Zorua;
import poke.view.PokeFrame;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controller
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	private PokeFrame window;
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "saved.pokemon";
		
		createPokedex();
		
		this.window = new PokeFrame(this);
	}
	
	public void start()
	{
		ArrayList<Pokemon> saved = IOController.loadData(dataFile, this);
		
		if (saved != null && saved.size() > 0)
		{
			this.pokedex = saved;
		}
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
	
	public String[] getPokemonData(int index)
	{
		String[] currentPokemonInfo = new String [5];
		
		Pokemon current = pokedex.get(index);
		
		currentPokemonInfo[0] = current.getName();
		currentPokemonInfo[1] = current.isCanEvolve() + "";
		currentPokemonInfo[2] = current.getHealth() + "";
		currentPokemonInfo[3] = current.getPokedexNumber() + "";
		
		String types = "";
		
		for (String type : current.getTypes())
		{
			types += type + "\n";
		}
		
		currentPokemonInfo[4] = types;
		
		return currentPokemonInfo;
	}
	
	public void updateCurrentPokemon(String name, int index, int health, boolean canEvolve)
	{
		Pokemon current = pokedex.get(index);
		
		current.setName(name);
		current.setHealth(health);
		current.setCanEvolve(canEvolve);
	}
	
	public boolean validateNumber(String text)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(text);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(window, "Use a valid number");
		}
		
		return isValid;
	}
	
	public void save()
	{
		IOController.saveData(dataFile, pokedex, this);
	}
	
	public PokeFrame getWindow()
	{
		return window;
	}

}
