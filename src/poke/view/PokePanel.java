package poke.view;

import poke.controller.Controller;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;

import java.awt.Color;
import java.awt.GridLayout;

public class PokePanel extends JPanel
{
	private Controller app;
	
	private SpringLayout layout;
	private JPanel fieldPanel;
	private JTextField nameField;
	private JTextField healthField;
	private JTextField numberField;
	private JTextArea typesArea;
	private JScrollPane typesPane;
	private JCheckBox evolveBox;
	private JLabel imageLabel;
	private ImageIcon pokemonImage;
	private JComboBox<String> pokedexSelector;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.app = app;
		
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		setBackground(Color.PINK);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}

}
