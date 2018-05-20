package com.github.javacliparser;

public class FlagOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;

	public FlagOptionParameter(String name, char cliChar, String purpose) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
	}
}