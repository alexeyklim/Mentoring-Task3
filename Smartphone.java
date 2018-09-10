package com.epam.mentoring.devices;

public class Smartphone implements Battery {
    private int batteryCharge;

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
