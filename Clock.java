package com.epam.mentoring.devices;

import java.util.*;
import java.text.*;

public class Clock implements Battery {
    private int batteryCharge;

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public static String displayTime() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
        String currentTime = formatForDateNow.format(dateNow);
        return currentTime;
    }

    public static void main(String[] args) {
        System.out.println("Текущее время:" + Clock.displayTime());

    }
}