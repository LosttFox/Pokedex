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
import javax.swing.DefaultComboBoxModel;

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
	private JButton updateButton;
	private JButton saveButton;
	
	private JLabel imageLabel;
	private ImageIcon pokemonImage;
	private JComboBox<String> pokedexSelector;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		
		this.fieldPanel = new JPanel(new GridLayout(0, 1));
		
		this.healthField = new JTextField("Health");
		this.nameField = new JTextField("Name");
		this.numberField = new JTextField("Number");
		
		this.evolveBox = new JCheckBox("Pokemon evolves?", false);
		
		this.updateButton = new JButton("Update!");
		this.saveButton = new JButton("Save!!");
		this.typesArea = new JTextArea(20, 20);
		this.typesPane = new JScrollPane();
		this.imageLabel = new JLabel("image");
		this.pokemonImage = new ImageIcon();
		this.pokedexSelector = new JComboBox<String>();
		
		setupDropDown();
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void updateDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "Espurr";
		String extension = ".png";
		
		try
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException error)
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + defaultName + extension));
			imageLabel.setText("Presenting: " + defaultName);
			pokedexSelector.setSelectedIndex(3);
			updateFields(3);
		}
		
		imageLabel.setIcon(pokemonImage);
		
		repaint();
	}
	
	private void setupDropDown()
	{
		String [] data = app.buildPokedexText();
		DefaultComboBoxModel<String> pokeModel = new DefaultComboBoxModel<String>(data);
		pokedexSelector.setModel(pokeModel);
	}
	
	private void updateFields(int index)
	{
		String[] data = app.getPokemonData(index);
		
		nameField.setText(data[0]);
		evolveBox.setSelected(Boolean.parseBoolean(data[1]));
		healthField.setText(data[2]);
		numberField.setText(data[3]);
		typesArea.setText(data[4]);
	}
	
	private void updatePokemonScreen()
	{
		String name = pokedexSelector.getSelectedItem().toString();
		int nameStart = name.indexOf(": ") + 2;
		name = name.substring(nameStart);
		imageLabel.setText("Presenting: " + name);
		updateDisplay(name);
		updateFields(pokedexSelector.getSelectedIndex());
	}
	
	private void collectInput()
	{
		String name = nameField.getText();
		String health = healthField.getText();
		boolean canEvolve = evolveBox.isSelected();
		int selectedPokemonIndex = pokedexSelector.getSelectedIndex();
		
		if (app.validateNumber(health))
		{
			int healthValue = Integer.parseInt(health);
			
			app.updateCurrentPokemon(name, selectedPokemonIndex, healthValue, canEvolve);
		}
	}
	
	private void setupPanel()
	{
		setBackground(Color.PINK);
		
		this.setLayout(layout);
		
		// Component settings
		numberField.setEnabled(false);
		typesArea.setEnabled(false);
		typesPane.setViewportView(typesArea);
		typesPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		typesPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		// FieldPanel
		fieldPanel.add(healthField);
		fieldPanel.add(nameField);
		fieldPanel.add(numberField);
		fieldPanel.add(evolveBox);
		fieldPanel.add(typesPane);
		fieldPanel.add(updateButton);
		fieldPanel.add(saveButton);
		
		// Main components
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
				
		updateDisplay("");
	}
	
	private void setupListeners()
	{
		updateButton.addActionListener(click -> collectInput());
		saveButton.addActionListener(click -> app.save());
		pokedexSelector.addActionListener(select -> updatePokemonScreen());
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, fieldPanel, -350, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, fieldPanel, -25, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, fieldPanel, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -25, SpringLayout.SOUTH, this);
		
		layout.putConstraint(SpringLayout.NORTH, imageLabel, 60, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, imageLabel, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.WEST, fieldPanel);
		
		layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
		layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -150, SpringLayout.SOUTH, this);
	}
}
