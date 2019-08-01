package com.JunitTestcases;

public class StringHelper 
{
public String swapLast2Chars(String str)
{
	int length = str.length();
	String strMinusLast2Chars=str.substring(0,length - 2);
	char secondLastChar = str.charAt(length - 2);
	char lastChar = str.charAt(length - 1);
	
	return strMinusLast2Chars +lastChar + secondLastChar;
}
}
