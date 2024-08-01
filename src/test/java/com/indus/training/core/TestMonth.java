package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Month Class
 */
public class TestMonth extends TestCase {

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test Case for getName method
	 */
	public void testGetName() {

		Month myMonth = Month.DECEMBER;
		String expResult = "December";
		String actResult = myMonth.getName();
		assertEquals(expResult, actResult);

	}

	/**
	 * Test Case for getNoOfDays method
	 */
	public void testGetNoOfDays() {
		Month myMonth = Month.DECEMBER;
		int expResult = 31;
		int actResult = myMonth.getNoOfDays();
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for getMonths method
	 */
	public void testGetMonths() {
		Month[] expMonths = { Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE,
				Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER };

		Month[] actMonths = Month.getMonths();

		for (int i = 0; i < expMonths.length; i++) {
			assertEquals(expMonths[i], actMonths[i]);
		}

	}

}
