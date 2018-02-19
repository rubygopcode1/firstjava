package com.bike;

public class Maintest {

	public Maintest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		MountainBike mb = new MountainBike(5, 80, 50, 2);
		System.out.println(mb.getSeatHeight() + ":" + mb.getCadence() + ":"
				+ mb.getSpeed() + ":" + mb.getGear());

	}

}
