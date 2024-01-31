package poke.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import poke.model.Pokemon;

public class IOController
{

	public IOController()
	{
		
	}

	public static ArrayList<Pokemon> loadData(String dataFile, Controller app)
	{
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
		
		return pokemonList;
	}
	
	public static void saveData(String dataFile, ArrayList<Pokemon> pokemonList, Controller app)
	{
		try (FileOutputStream saveStream = new FileOutputStream(dataFile); 
			 ObjectOutputStream output = new ObjectOutputStream(saveStream))
		{
			
		}
		catch (IOException error)
		{
			
		}
	}
}
