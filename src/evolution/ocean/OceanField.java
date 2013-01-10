package evolution.ocean;

import evolution.output.Output;

public class OceanField {
	
	private int sunshine;
	private int xField;
	private int yField;
	
	public OceanField(int sunshine, int xField, int yField){
		this.sunshine = sunshine;
		this.xField = xField;
		this.yField = yField;
		Output.printLog("created field positioned on "+xField+"x"+yField+" with sunshine "+sunshine);
	}

	public int getSunshine() {
		return sunshine;
	}

	public void setSunshine(int sunshine) {
		this.sunshine = sunshine;
	}

}
