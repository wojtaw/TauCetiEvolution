package evolution.ocean;

import evolution.output.Output;

public class OceanField {
	
	private int sunshine;
	
	public OceanField(int sunshine){
		this.sunshine = sunshine;
		Output.printLog("created field with sunshine "+sunshine);
	}

	public int getSunshine() {
		return sunshine;
	}

	public void setSunshine(int sunshine) {
		this.sunshine = sunshine;
	}

}
