package com.github.javacliparser;

public class StringOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public String defaultVal;

	public StringOptionParameter(String name, char cliChar, String purpose, String defaultVal) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultVal = defaultVal;
	}
}