package com.epam.mentoring.devices;

public interface Battery {
//TODO: AK Не совсем понятна идея этого интерфейса, почему метод статический и зачем мы передаем в него batteryCharge?
    public static int findBatteryCharge(int batteryCharge) {
        return batteryCharge;
    }
}
