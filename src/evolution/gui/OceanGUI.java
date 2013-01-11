package evolution.gui;

import java.awt.Color;
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
			this.setSize(1000,600);
			
			fieldLabels = new JLabel[fieldWidth][fieldHeight];
			JLabel tmpLabel;
			for (int i = 0; i < fieldWidth; i++) {
				for (int j = 0; j < fieldHeight; j++) {
					tmpLabel = new JLabel("-"+simulation.getOcean().getFieldAt(i, j).getSunshine()+"-");
					tmpLabel.setBackground(Color.GREEN);
					tmpLabel.setOpaque(true);
					this.add(tmpLabel);
				}
			}
			
			
			setVisible(true);		
	  }

}
