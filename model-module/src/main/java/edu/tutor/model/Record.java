package edu.tutor.model;

public class Record
{
	private String label;
	private int number;
	
	public Record()
	{
		this.label = "Default";
		this.number = 0;
	}
	
	public Record(String label, int number)
	{
		this.label = label;
		this.number = number;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

}
