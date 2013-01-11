package evolution.controllers;

import evolution.gui.OceanGUI;
import evolution.life.*;
import evolution.ocean.Ocean;
import evolution.output.Output;

public class SimulationController {
	private BacteriaColony firstColony;
	private Ocean vastOcean;
	
	public SimulationController(){
		vastOcean = new Ocean(10,20);
		OceanGUI oceanGUI = new OceanGUI(10,20, this);
		
		
		Ocean tmpOcean = new Ocean(10,20);
		tmpOcean.printOceanToConsole();
		firstColony = new BacteriaColony();
		firstColony.bornBacterias(50);
		runSimulationTime(101);
		
	}
	
	public Ocean getOcean(){
		return vastOcean;
	}
	

	private void runSimulationTime(int numberOfSeconds) {
		for (int i = 0; i < numberOfSeconds; i++) {
			Output.printLog("-NEXT TIME STEP-");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			firstColony.calculateNextStep();
		}
		
	}
	

}
