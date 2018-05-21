/*
 * Copyright 2007 University of Waikato.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	        http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.  
 */

package com.github.javacliparser;

/**
 * Int option.
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 7 $
 */
public class IntOption extends AbstractOption {

    private static final long serialVersionUID = 1L;

    protected int currentVal;

    protected int defaultVal;

    protected int minVal;

    protected int maxVal;

    private IntOption(IntOptionParameter parameterObject) {
        this(new IntOptionParameter2(parameterObject.name, parameterObject.cliChar, parameterObject.purpose, parameterObject.defaultVal, Integer.MIN_VALUE,
				Integer.MAX_VALUE));
    }

    private IntOption(IntOptionParameter2 parameterObject) {
        super(parameterObject.name, parameterObject.cliChar, parameterObject.purpose);
        this.defaultVal = parameterObject.defaultVal;
        this.minVal = parameterObject.minVal;
        this.maxVal = parameterObject.maxVal;
        resetToDefault();
    }

    public void setValue(int v) {
        if (v < this.minVal) {
            throw new IllegalArgumentException("Option " + getName()
                    + " cannot be less than " + this.minVal
                    + ", out of range: " + v);
        }
        if (v > this.maxVal) {
            throw new IllegalArgumentException("Option " + getName()
                    + " cannot be greater than " + this.maxVal
                    + ", out of range: " + v);
        }
        this.currentVal = v;
    }

    public int getValue() {
        return this.currentVal;
    }

    public int getMinValue() {
        return this.minVal;
    }

    public int getMaxValue() {
        return this.maxVal;
    }

    @Override
    public String getDefaultCLIString() {
        return intToCLIString(this.defaultVal);
    }

    @Override
    public String getValueAsCLIString() {
        return intToCLIString(this.currentVal);
    }

    @Override
    public void setValueViaCLIString(String s) {
        setValue(cliStringToInt(s));
    }

    public static int cliStringToInt(String s) {
        return Integer.parseInt(s.trim());
    }

    public static String intToCLIString(int i) {
        return Integer.toString(i);
    }

	public static IntOption createIntOption(IntOptionParameter parameterObject) {
		return new IntOption(parameterObject);
	}

	public static IntOption createIntOption2(IntOptionParameter2 parameterObject) {
		return new IntOption(parameterObject);
	}

    //@Override
    //public JComponent getEditComponent() {
    //    return new IntOptionEditComponent(this);
    //}
}
