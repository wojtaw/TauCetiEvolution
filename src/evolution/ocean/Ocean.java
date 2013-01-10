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
		OceanField[] VastOceanField = new OceanField[10];
		for (int i = 0; i < 10; i++) 
		{	
			int tmpSunshine = generateSunshine();
			VastOceanField[i] =  new OceanField(tmpSunshine);
		}
	}
	
	public int generateSunshine()
	{
	int sunshine;
	sunshine = (int) Math.floor(Math.random()*100);
	return sunshine;
	}
	

}
