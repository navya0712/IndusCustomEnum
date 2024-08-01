package com.indus.training.core;

/**
 * Represents month of a year
 */
public final class Month {

	/**
	 * Constant for January
	 */
	public static final Month JANUARY = new Month("January", 31);
	/**
	 * Constant for February
	 */
	public static final Month FEBRUARY = new Month("February", 28);
	/**
	 * Constant for March
	 */
	public static final Month MARCH = new Month("March", 30);
	/**
	 * Constant for April
	 */
	public static final Month APRIL = new Month("April", 30);
	/**
	 * Constant for May
	 */
	public static final Month MAY = new Month("May", 31);
	/**
	 * Constant for June
	 */
	public static final Month JUNE = new Month("June", 30);
	/**
	 * Constant for July
	 */
	public static final Month JULY = new Month("July", 31);
	/**
	 * Constant for August
	 */
	public static final Month AUGUST = new Month("August", 31);
	/**
	 * Constant for September
	 */
	public static final Month SEPTEMBER = new Month("September", 30);
	/**
	 * Constant for October
	 */
	public static final Month OCTOBER = new Month("October", 31);
	/**
	 * Constant for November
	 */
	public static final Month NOVEMBER = new Month("November", 30);
	/**
	 * Constant for December
	 */
	public static final Month DECEMBER = new Month("December", 31);
	private String name;
	private int noOfDays;

	/**
	 * Private overloaded constructor to initialize the name and number of days in a
	 * month
	 * 
	 * @param name     the month name
	 * @param noOfDays number of days in a month
	 */
	private Month(String name, int noOfDays) {
		this.name = name;
		this.noOfDays = noOfDays;

	}

	/**
	 * Returns the name of the month
	 * 
	 * @return the month name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the number of days in a month
	 * 
	 * @return the number of days
	 */
	public int getNoOfDays() {
		return noOfDays;
	}

	/**
	 * Returns all the months in a year
	 * 
	 * @return the months
	 */
	public static Month[] getMonths() {
		return new Month[] { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER,
				DECEMBER };

	}

}
