package evolution.ocean;

import evolution.output.Output;

public class Ocean {
	
	public Ocean()
	{	
		Output.printLog("Initializing Ocean");
		createOcean();
		Output.printLog("Long live to bacterias.");
	}
	
	private void createOcean()
	{	
		OceanField[][] VastOceanField = new OceanField[10][10];
		for (int i = 0; i < 10; i++) 
		{	
			for (int j = 0; j < 10; j++)
			{
				int tmpSunshine = generateSunshine();
				VastOceanField[i][j] =  new OceanField(tmpSunshine, i+1, j+1);
			}

		}
	}
	
	public int generateSunshine()
	{
	int sunshine;
	sunshine = (int) Math.floor(Math.random()*100);
	return sunshine;
	}
	

}
