package evolution.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OceanGUI extends JFrame{
	private JLabel[][] fieldLabels;
	
	  public OceanGUI(int fieldWidth, int fieldHeight) {
			this.setTitle("TauCeti Evolution");
			this.setSize(1000,600); 
			this.setLocation(10,10);
			
			fieldLabels = new JLabel[fieldWidth][fieldHeight];
			for (int i = 0; i < fieldWidth; i++) {
				
			}
			
			JLabel jlbHelloWorld = new JLabel("Hello World");
			this.add(jlbHelloWorld);
			setVisible(true);		
	  }

}
