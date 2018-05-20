package com.github.javacliparser;

public class ClassOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public Class<?> requiredType;
	public String defaultCLIString;

	public ClassOptionParameter(String name, char cliChar, String purpose, Class<?> requiredType,
			String defaultCLIString) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.requiredType = requiredType;
		this.defaultCLIString = defaultCLIString;
	}
}