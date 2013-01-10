package evolution.life;

import java.util.ArrayList;

import evolution.output.Output;

public class BacteriaColony {
	private ArrayList<Bacteria> allBacterias= new ArrayList<Bacteria>(); 
	
	public BacteriaColony() {
		
		
	}
	
	public void bornBacterias(int numberOfBabies){
		Bacteria tmpBacteria;
		for (int i = 0; i < numberOfBabies; i++) {
			tmpBacteria = new Bacteria();
			allBacterias.add(tmpBacteria);
			Output.printLog(tmpBacteria.getName()+" was born");
		}
	}
	
	public void calculateNextStep(){
		for (int i = 0; i < allBacterias.size(); i++) {
			allBacterias.get(i).nextTimeUnit();
		}

	}
	
	
	
}
