package com.github.javacliparser;

public class IntOptionParameter2 {
	public String name;
	public char cliChar;
	public String purpose;
	public int defaultVal;
	public int minVal;
	public int maxVal;

	public IntOptionParameter2(String name, char cliChar, String purpose, int defaultVal, int minVal, int maxVal) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultVal = defaultVal;
		this.minVal = minVal;
		this.maxVal = maxVal;
	}
}