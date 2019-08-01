package com.JunitTestcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testStringwith2CharsReverse() {
		StringHelper helper = new StringHelper();
		assertEquals("BA", helper.swapLast2Chars("AB"));
	}
	@Test
	public void testStringWith4CharsReverse()
	{
		StringHelper helper = new StringHelper();
		assertEquals("ABDC", helper.swapLast2Chars("ABCD"));
		
	}


}
