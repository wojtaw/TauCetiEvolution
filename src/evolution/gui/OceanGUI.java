package evolution.gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import evolution.controllers.SimulationController;

public class OceanGUI extends JFrame{
	private JLabel[][] fieldLabels;
	private SimulationController simulation;
	
	  public OceanGUI(int fieldWidth, int fieldHeight, SimulationController simulation) {
			this.setTitle("TauCeti Evolution");
			this.setLocation(10,10);
			this.setLayout(new GridLayout(fieldWidth, fieldHeight));
			
			fieldLabels = new JLabel[fieldWidth][fieldHeight];
			JLabel tmpLabel;
			for (int i = 0; i < fieldWidth; i++) {
				for (int j = 0; j < fieldHeight; j++) {
					tmpLabel = new JLabel("as"+i);
					this.add(tmpLabel);
				}
			}
			
			
			setVisible(true);		
	  }

}
