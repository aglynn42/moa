package com.github.javacliparser;

public class ClassOptionParameter2 {
	public String name;
	public char cliChar;
	public String purpose;
	public Class<?> requiredType;
	public String defaultCLIString;
	public String nullString;

	public ClassOptionParameter2(String name, char cliChar, String purpose, Class<?> requiredType,
			String defaultCLIString, String nullString) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.requiredType = requiredType;
		this.defaultCLIString = defaultCLIString;
		this.nullString = nullString;
	}
}