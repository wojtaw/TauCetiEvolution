package evolution.life;

public interface OrganismInterface {
	
	public void nextTimeUnit();
	public int getHealth();
	public int getFoodSuply();
	public String getName();
	public String getSpecies();
	public int getxPos();
	public int getyPos();
	public void setxPos(int xPos);
	public void setyPos(int yPos);

}
