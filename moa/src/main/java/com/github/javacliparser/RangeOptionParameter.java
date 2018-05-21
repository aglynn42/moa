package com.github.javacliparser;

public class RangeOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public String defaultValue;

	public RangeOptionParameter(String name, char cliChar, String purpose, String defaultValue) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultValue = defaultValue;
	}
}