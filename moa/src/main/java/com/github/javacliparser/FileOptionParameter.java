package com.github.javacliparser;

public class FileOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public String defaultFileName;
	public String defaultExtension;
	public boolean isOutput;

	public FileOptionParameter(String name, char cliChar, String purpose, String defaultFileName,
			String defaultExtension, boolean isOutput) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.defaultFileName = defaultFileName;
		this.defaultExtension = defaultExtension;
		this.isOutput = isOutput;
	}
}