package com.indus.training.core;

/**
 * Represents Day of a week
 */
public final class Day {

	/**
	 * Constant for Monday
	 */
	public static final Day MONDAY = new Day("Monday");
	/**
	 * Constant for Tuesday
	 */
	public static final Day TUESDAY = new Day("Tuesday");
	/**
	 * Constant for Wednesday
	 */
	public static final Day WEDNESDAY = new Day("Wednesday");
	/**
	 * Constant for Thursday
	 */
	public static final Day THURSDAY = new Day("Thursday");
	/**
	 * Constant for Friday
	 */
	public static final Day FRIDAY = new Day("Friday");
	/**
	 * Constant for Saturday
	 */
	public static final Day SATURDAY = new Day("Saturday");
	/**
	 * Constant for Sunday
	 */
	public static final Day SUNDAY = new Day("Sunday");
	private String name;

	/**
	 * Private Constructor to initialize day with specific name
	 * 
	 * @param name the name of the day
	 */
	private Day(String name) {
		this.name = name;
	}

	/**
	 * returns the name of the day
	 * 
	 * @return the day name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the number associated with the day in a week
	 * 
	 * @return the day number
	 */
	public int getDayNumber() {
		int number = 1;
		{
			if (this == MONDAY) {
				number = 1;
			} else if (this == TUESDAY) {
				number = 2;
			} else if (this == WEDNESDAY) {
				number = 3;
			} else if (this == THURSDAY) {
				number = 4;
			} else if (this == FRIDAY) {
				number = 5;
			} else if (this == SATURDAY) {
				number = 6;
			} else if (this == SUNDAY) {
				number = 7;
			}

		}
		return number;

	}

	/**
	 * Determines if it is a week day or not
	 * 
	 * @return {@code}true if weekday else {@code}false
	 */
	public boolean isWeekDay() {
		if (!(this == SUNDAY || this == SATURDAY)) {
			return true;

		}
		return false;
	}

	/**
	 * Returns all the days in a week
	 * 
	 * @return the days
	 */
	public static Day[] getDaysOfWeek() {
		return new Day[] { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

	}

}