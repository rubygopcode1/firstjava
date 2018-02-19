package com.bike;

public class Bicycle {

	// the Bicycle class has three fields
	public int cadence;
	public int gear;
	public int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// the Bicycle class has one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// the Bicycle class has four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

}
