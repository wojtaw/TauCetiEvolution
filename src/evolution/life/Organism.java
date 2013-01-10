package evolution.life;

import javax.swing.text.Position;

import evolution.output.Output;

public class Organism implements OrganismInterface{
	protected int foodSupply = 100; //0-100
	protected int health = 100; //0-100	
	protected boolean isAlive = true;
	protected String name = "untitled";
	
	public Organism(){
		assignRandomName();
	}

	private void assignRandomName() {
		int position = (int) Math.floor(Math.random() * (OrganismNames.names.length-1));
		this.name = OrganismNames.names[position];
	}

	@Override
	public void nextTimeUnit() {
		foodSupply--;
		if(foodSupply < 30){
			health--;
			Output.printLog(this.name + " is starving");
		}
			
		if(health <= 0) {
			isAlive = false;
			Output.printLog(this.name + " died");
		}
	}

	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public int getFoodSuply() {
		return this.foodSupply;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
