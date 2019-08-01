package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass 
{
Calculations obj = new Calculations();

@Test
public void twoPulsThree()
{
	assertEquals(4,obj.add(2,2));
}
}
