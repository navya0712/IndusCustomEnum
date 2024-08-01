package com.indus.training.core;

/**
 * Represents Planet in the Universe
 */
final public class Planet {
	/**
	 * Constant for G
	 */

	public static final double G = 6.67300E-11;

	/**
	 * Constant for Mercury
	 */
	public static final Planet MERCURY = new Planet("Mercury", 3.303e+23, 2.4397e6);
	/**
	 * Constant for Venus
	 */
	public static final Planet VENUS = new Planet("Venus", 4.869e+24, 6.0518e6);
	/**
	 * Constant for Earth
	 */
	public static final Planet EARTH = new Planet("Earth", 5.976e+24, 6.37814e6);
	/**
	 * Constant for Mars
	 */
	public static final Planet MARS = new Planet("Mars", 6.421e+23, 3.3972e6);
	/**
	 * Constant for Jupiter
	 */
	public static final Planet JUPITER = new Planet("Jupiter", 1.9e+27, 7.1492e7);
	/**
	 * Constant for Saturn
	 */
	public static final Planet SATURN = new Planet("Saturn", 5.688e+26, 6.0268e7);
	/**
	 * Constant for Uranus
	 */
	public static final Planet URANUS = new Planet("Uranus", 8.686e+25, 2.5559e7);
	/**
	 * Constant for Neptune
	 */
	public static final Planet NEPTUNE = new Planet("Neptune", 1.024e+26, 2.4746e7);
	private String name;
	private double mass;
	private double radius;

	/**
	 * Private Overloaded constructor which take name,mass and radius as parameters
	 * 
	 * @param name   the planet name
	 * @param mass   the planet mass
	 * @param radius the planet radius
	 */
	private Planet(String name, double mass, double radius) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}

	/**
	 * returns the mass of the planet
	 * 
	 * @return the planet mass
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * returns the radius of the planet
	 * 
	 * @return the planet radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * returns the name of the planet
	 * 
	 * @return the planet name
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns the mass of the planet calculated based on mass and radius
	 * 
	 * @return the planet surface gravity
	 */
	double surfaceGravity() {
		return G * mass / (radius * radius);
	}

}
