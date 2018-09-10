package com.epam.mentoring.devices;

public class Phone implements Battery {
    private int batteryCharge;

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
