package com.wzq.www;

import org.junit.Test;

import junit.framework.Assert;

public class TestCase1 {
    @Test
	public void testSum1() {
		int res =SmartUntil.sum1(1, 3);
		
	   Assert.assertEquals(4, res);
	}
}
