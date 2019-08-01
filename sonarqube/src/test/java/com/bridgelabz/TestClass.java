package com.bridgelabz;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.Calculation;


public class TestClass 
{
Calculation obj = new Calculation();

@Test
public void twoPulsThree()
{
	assertEquals(4,obj.add(2,2));
}
}
