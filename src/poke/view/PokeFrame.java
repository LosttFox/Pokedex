package poke.view;

import javax.swing.JFrame;
import poke.controller.Controller;

public class PokeFrame extends JFrame
{
	private Controller app;
	private PokePanel window;
	
	public PokeFrame(Controller app)
	{
		super();
		
		this.app = app;
		this.window = new PokePanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(window);
		this.setTitle("Pokédex");
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
