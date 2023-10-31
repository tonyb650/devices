package com.tonyb650.devices;

public class Device {
	private int battery;

	public Device() {
		this.battery = 100;
	}
	
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void displayBattery( ) {
		if(this.battery<=10) {
			System.out.println("Battery critical!! Only" + this.battery + "% remaining.");
		} else 
		{
			System.out.println("The battery has " + this.battery + "% remaining.");
		}
	}
}
