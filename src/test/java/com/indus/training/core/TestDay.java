package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Day Class
 */
public class TestDay extends TestCase {

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
	 * Test case for getName method
	 */
	public void testGetName() {

		Day myDay = Day.MONDAY;
		String expResult = "Monday";
		String actResult = myDay.getName();
		assertEquals(expResult, actResult);

	}

	/**
	 * Test case for getDaysOfWeek method
	 */
	public void testGetDaysOfWeek() {

		Day[] expDays = { Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY };

		Day[] actDays = Day.getDaysOfWeek();

		for (int i = 0; i < expDays.length; i++) {
			assertEquals(expDays[i], actDays[i]);
		}

	}

	/**
	 * Test case for getDayNumber method
	 */
	public void testGetDayNumber() {
		Day myday = Day.TUESDAY;
		int expResult = 2;
		int actResult = myday.getDayNumber();
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test case for isWeekDay method
	 */
	public void testISWeekDay() {
		Day myday = Day.TUESDAY;
		boolean expResult = true;
		boolean actResult = myday.isWeekDay();
		assertEquals(expResult, actResult);

	}

}
