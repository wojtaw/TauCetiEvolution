package evolution.life;

public class Organism implements OrganismInterface{
	protected int foodSupply = 100; 	//0-100
	protected int health = 100;		 	//0-100	
	protected int xPos = 0;				//x position on canvas
	protected int yPos = 0;				//y position on canvas
	protected boolean isAlive = true;
	protected String name = "untitled";
	protected String species = "untitled";
	
	public Organism(){
		assignRandomName();
	}

	private void assignRandomName() {
		int position = (int) Math.floor(Math.random() * (OrganismNames.names.length-1));
		this.name = "Organismus "+OrganismNames.names[position];
	}

	@Override
	public void nextTimeUnit() {

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
	
	public String getSpecies() {
		return this.species;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

}
