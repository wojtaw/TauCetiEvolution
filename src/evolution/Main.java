package evolution;

import evolution.controllers.SimulationController;
import evolution.output.Output;

public class Main
{
	public static void main(String[] args) 
	{
		Output.printLog("Initializing Universe");
		SimulationController VastSimulationController = new SimulationController();
	}
}
