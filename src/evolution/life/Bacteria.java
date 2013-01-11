package evolution.life;

import evolution.output.Output;

public class Bacteria extends Organism{
	
	public Bacteria(){
		
	}
	
	@Override
	public void nextTimeUnit() 
		{
		boolean foodAvailable = true;
		foodSupply = bacterialDigestion( foodSupply, foodAvailable);
		health = bacterialRegeneration( foodSupply, health);
		if (foodSupply == 100)
			{
				bacterialProliferation();
			}
		if (health == 0)
			{
				bacterialDeath();
			}
		
		}
	
	private int bacterialDigestion(int foodSupply, boolean foodAvailable)
		{	
			foodSupply = foodSupply - 5;
				if (foodAvailable = true){
					foodSupply = foodSupply+10;
					Output.printLog(this.name + " is eating");
				}
				if (foodSupply > 100){
					foodSupply = 100;
				}
				if (foodSupply <0){
					foodSupply = 0;
				}
			return foodSupply;
		}
	
	private int bacterialRegeneration(int foodSupply, int health)
		{
		
				if(foodSupply > 70){
					health = health+3;
					Output.printLog(this.name + " is floourishing");} 
				else if(foodSupply < 30 && foodSupply >= 0){
					health = health-2;
					Output.printLog(this.name + " is hungry");} 
				else if (foodSupply <0){
					health = health-5;
					foodSupply = 0;
					Output.printLog(this.name + " is starving");}
			return health;
		}
	
	public void bacterialProliferation()
		{
			Output.printLog(this.name + " has PROLIFERATED!");
		}
	
	public void bacterialDeath()
		{
			this.isAlive = false;
			Output.printLog(this.name + " died");
		}
}
