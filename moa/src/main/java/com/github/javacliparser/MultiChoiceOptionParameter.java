package com.github.javacliparser;

public class MultiChoiceOptionParameter {
	public String name;
	public char cliChar;
	public String purpose;
	public String[] optionLabels;
	public String[] optionDescriptions;
	public int defaultOptionIndex;

	public MultiChoiceOptionParameter(String name, char cliChar, String purpose, String[] optionLabels,
			String[] optionDescriptions, int defaultOptionIndex) {
		this.name = name;
		this.cliChar = cliChar;
		this.purpose = purpose;
		this.optionLabels = optionLabels;
		this.optionDescriptions = optionDescriptions;
		this.defaultOptionIndex = defaultOptionIndex;
	}
}