package evolution.ocean;

import evolution.output.Output;

public class Ocean {
	private int oceanWidth;
	private int oceanHeight;
	private OceanField[][] vastOceanField;
	
	public Ocean(int oceanWidth, int oceanHeight)
	{	
		Output.printLog("Initializing Ocean");		
		this.oceanWidth = oceanWidth;
		this.oceanHeight = oceanHeight;		
		createOceanFields();
	}
	
	private void createOceanFields() {	
		vastOceanField = new OceanField[oceanWidth][oceanHeight];
		for (int i = 0; i < oceanWidth; i++) 
		{	
			for (int j = 0; j < oceanHeight; j++) {
				int tmpSunshine = generateSunshine();
				vastOceanField[i][j] =  new OceanField(tmpSunshine, i+1, j+1);
			}

		}
	}
	
	public int generateSunshine() {
		int sunshine;
		sunshine = (int) Math.floor(Math.random()*100);
		return sunshine;
	}
	
	public void printOceanToConsole(){
		for (int i = 0; i < oceanWidth; i++) {
			for (int j = 0; j < oceanHeight; j++) {
				System.out.print("|"+vastOceanField[i][j].getSunshine());
			}
			System.out.print("|\n");
		}		
	}
	
	public OceanField getFieldAt(int x, int y){
		return vastOceanField[x][y];
	}

}
