package evolution.life;

import evolution.output.Output;

public class Bacteria extends Organism{
	
	public Bacteria(){
		
	}
	
	@Override
	public void nextTimeUnit() {
		foodSupply--;
		if(foodSupply > 70){
			health++;
			Output.printLog(this.name + " is regenerating");
		} else if(foodSupply < 30){
			health--;
			Output.printLog(this.name + " is starving");			
		}
		
		if(health <= 30){
			Output.printLog(this.name + " dying");
		}else if(health <= 0) {
			isAlive = false;
			Output.printLog(this.name + " died");
		}
	}	
	
}
