package com.github.javacliparser;

public class ListOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public Option expectedType;
	public Option[] defaultLists;
	public char separatorChar;

	public ListOptionParameter(String name, char cliChar, String purpose, Option expectedType, Option[] defaultLists,
			char separatorChar) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.expectedType = expectedType;
		this.defaultLists = defaultLists;
		this.separatorChar = separatorChar;
	}
}