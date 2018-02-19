package com.bike;

public class MountainBike extends Bicycle {
	
	public int seatHeight;

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public MountainBike(int startHeight,int startCadence,int startSpeed,int startGear) {
		super(startCadence,startSpeed,startGear);
		this.seatHeight = startHeight;
	}

}
