package com.github.javacliparser;

public class IntOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public int defaultVal;

	public IntOptionParameter(String name, char cliChar, String purpose, int defaultVal) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultVal = defaultVal;
	}
}