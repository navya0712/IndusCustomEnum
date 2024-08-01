package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Planet Class
 */
public class TestPlanet extends TestCase {

	/**
	 * Sets Up the Test environment
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
	 * Test Case for getMass method
	 */
	public void testGetMass() {
		Planet myPlanet = Planet.EARTH;
		double expResult = 5.976e+24;
		double actResult = myPlanet.getMass();
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for getRadius method
	 */
	public void testGetRadius() {
		Planet myPlanet = Planet.EARTH;
		double expResult = 6.37814e6;
		double actResult = myPlanet.getRadius();
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for getName method
	 */
	public void testGetName() {
		Planet myPlanet = Planet.EARTH;
		String expResult = "Earth";
		String actResult = myPlanet.getName();
		assertEquals(expResult, actResult);
	}

	/**
	 * Test Case for surfaceGravity method
	 */
	public void testSurfaceGravity() {
		Planet myPlanet = Planet.EARTH;
		double expResult = 9.802652743337129;
		double actResult = myPlanet.surfaceGravity();
		assertEquals(expResult, actResult, 0);
	}

}
