package com.github.javacliparser;

public class FloatOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public double defaultVal;

	public FloatOptionParameter(String name, char cliChar, String purpose, double defaultVal) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultVal = defaultVal;
	}
}