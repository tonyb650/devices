package com.tonyb650.devices;

public class Phone extends Device {
	
	public Phone() {
		super();
	}
	public void makeCall() {
		System.out.println("Making a call now...");
		setBattery(getBattery()-5);
		super.displayBattery();
	}
	public void playGame() {
		if(getBattery()<=25) {
			System.out.println("Insufficient battery to play a game...");
		} else {
			System.out.println("Playing a game now...");
			super.setBattery(getBattery()-20);
		}
		super.displayBattery();
	}
	public void chargeUp() {
		System.out.println("Charging phone now...");
		super.setBattery(getBattery()+50);
		super.displayBattery();
	}
}
