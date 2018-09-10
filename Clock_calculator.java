package com.epam.mentoring.devices;

public class Clock_calculator implements Battery {

    private Clock clock;
    private Calculator calculator;
    private int batteryCharge;

    public Clock getClock() {
        return clock;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public Clock_calculator() {
        this.clock = new Clock();
        this.calculator = new Calculator();
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }


    public static void main(String[] args) {
        Clock_calculator dev1 = new Clock_calculator();

        dev1.getClock().displayTime();

        int num1 = dev1.getCalculator().getInt();
        int num2 = dev1.getCalculator().getInt();
        char operation = dev1.getCalculator().getOperation();
        int result = dev1.getCalculator().calc(num1, num2, operation);
        System.out.println(" Результат операции:" + result);

    }
}
